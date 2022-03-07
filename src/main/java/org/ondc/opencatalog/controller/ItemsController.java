package org.ondc.opencatalog.controller;

import com.venky.core.string.StringUtil;
import com.venky.swf.db.model.Model;
import com.venky.swf.integration.IntegrationAdaptor;
import com.venky.swf.path.Path;
import com.venky.swf.routing.Config;
import com.venky.swf.views.HtmlView;
import com.venky.swf.views.View;
import org.ondc.opencatalog.db.model.Company;
import org.ondc.opencatalog.db.model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ItemsController extends CatalogController<Item> {
    public ItemsController(Path path) {
        super(path);
    }

    @Override
    protected <T> View list(List<Item> records, boolean isCompleteList, IntegrationAdaptor<Item, T> overrideIntegrationAdaptor) {
        resetImages(records);
        return super.list(records, isCompleteList, overrideIntegrationAdaptor);
    }

    @Override
    protected <T> View show(Item record, IntegrationAdaptor<Item, T> returnIntegrationAdaptor) {
        resetImages(Collections.singletonList(record));
        return super.show(record, returnIntegrationAdaptor);
    }

    @Override
    protected void persistModels(List<Item> models) {
        super.persistModels(models);
        resetImages(models);
    }
    protected HtmlView createModelEditView(Item record, String formAction) {
        resetImages(Arrays.asList(record));
        return super.createModelEditView(record,formAction);
    }
    public void resetImages(List<Item> items){
        for (Item item : items){
            List<String> sanitizedImages = new ArrayList<>();
            String[] images = item.getImages();
            if (images == null){
                continue;
            }
            if (images.length > 0){
                if (images[0].startsWith("[") && images[0].endsWith("]") && images.length == 1){
                    StringTokenizer tokenizer = new StringTokenizer(images[0], "[],\"");
                    while (tokenizer.hasMoreTokens()){
                        sanitizedImages.add(tokenizer.nextToken().trim());
                    }
                    images = sanitizedImages.toArray(new String[]{});
                    sanitizedImages.clear();
                }

                for (String image : images){
                    if (!image.matches("^http[s]://.*$")){
                        sanitizedImages.add(String.format("%s%s", Config.instance().getServerBaseUrl(),image));
                    }
                }
            }

            item.setImages(sanitizedImages.toArray(new String[]{}));
        }
    }

    @Override
    protected Map<Class<? extends Model>, List<String>> getIncludedModelFields() {
        Map<Class<? extends Model>,List<String>> map = super.getIncludedModelFields();
        if (map.isEmpty() && getReturnIntegrationAdaptor() != null){
            map.put(Item.class,getReflector().getVisibleFields(Collections.singletonList("ID")));
            map.put(Company.class, Collections.singletonList("NAME"));
        }
        return map;
    }
}
