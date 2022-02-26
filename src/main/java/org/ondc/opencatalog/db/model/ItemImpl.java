package org.ondc.opencatalog.db.model;

import com.venky.core.util.ObjectHolder;
import com.venky.swf.db.table.ModelImpl;

import java.util.List;

public class ItemImpl extends ModelImpl<Item> {
    public ItemImpl(Item item){
        super(item);
    }
    public Long getPriceId(){
        Price price = getPrice();
        return price == null ? null : price.getId();
    }
    public Long getDescriptorId(){
        Descriptor descriptor = getDescriptor();
        return descriptor == null ? null : descriptor.getId();
    }

    public Long getTagsId() {
        Tags tags = getTags();
        return tags == null ? null : tags.getId();
    }

    ObjectHolder<Price> priceObjectHolder = new ObjectHolder<>(null);
    ObjectHolder<Descriptor> descriptorObjectHolder = new ObjectHolder<>(null);
    ObjectHolder<Tags> tagsObjectHolder = new ObjectHolder<>(null);

    public Price getPrice(){
        if (priceObjectHolder.get() == null){
            List<Price> priceList = getProxy().getPriceList();
            if (priceList.size() > 0){
                priceObjectHolder.set(priceList.get(0));
            }
        }
        return priceObjectHolder.get();
    }
    public Descriptor getDescriptor(){
        if (descriptorObjectHolder.get() == null) {
            List<Descriptor> list = getProxy().getDescriptorList();
            if (list.size() > 0) {
                descriptorObjectHolder.set(list.get(0));
            }
        }
        return descriptorObjectHolder.get();
    }

    public Tags getTags(){
        if (tagsObjectHolder.get() == null){
            List<Tags> list = getProxy().getTagsList();
            if (list.size() > 0) {
                tagsObjectHolder.set(list.get(0));
            }
        }
        return tagsObjectHolder.get();
    }
}
