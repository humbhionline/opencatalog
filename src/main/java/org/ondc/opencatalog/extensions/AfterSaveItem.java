package org.ondc.opencatalog.extensions;

import com.venky.core.collections.SequenceSet;
import com.venky.core.util.ObjectHolder;
import com.venky.swf.db.Database;
import com.venky.swf.db.extensions.AfterModelSaveExtension;
import com.venky.swf.plugins.background.core.TaskManager;
import com.venky.swf.routing.Config;
import org.ondc.opencatalog.db.model.Attachment;
import org.ondc.opencatalog.db.model.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AfterSaveItem extends AfterModelSaveExtension<Item> {
    static{
        registerExtension(new AfterSaveItem());
    }
    @Override
    public void afterSave(Item model) {
        if (model.getImages() == null){
            return;
        }
        Map<String, Attachment> urls = new HashMap<>();

        model.getAttachments().forEach(a->urls.put(a.getAttachmentUrl(),a));

        Set<String> imageUrls = new HashSet<>(Arrays.asList(model.getImages()));
        Set<String> existingUrls = new HashSet<>(urls.keySet());



        imageUrls.forEach(urls::remove);
        urls.forEach((u,a)->a.destroy());

        imageUrls.removeAll(existingUrls);



        ObjectHolder<Boolean> fixItemImageArray = new ObjectHolder<>(false);
        imageUrls.forEach(u->{
            Attachment a = Database.getTable(Attachment.class).newRecord();
            a.setItemId(model.getId());
            a.setUploadUrl(u);
            a.save();
            fixItemImageArray.set(true);
        });

        if (fixItemImageArray.get()){
            TaskManager.instance().executeAsync(()->{
                Item m = Database.getTable(Item.class).get(model.getId());
                Set<String> imagesSet = new SequenceSet<>();
                m.getAttachments().forEach(a->imagesSet.add(a.getAttachmentUrl()));
                m.setImages(imagesSet.toArray(new String[]{}));
                m.save();
            },false);
        }


    }
}
