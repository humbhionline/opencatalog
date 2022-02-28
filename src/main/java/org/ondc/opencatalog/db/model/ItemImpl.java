package org.ondc.opencatalog.db.model;

import com.venky.swf.db.table.ModelImpl;

public class ItemImpl extends ModelImpl<Item> {
    public ItemImpl(Item item){
        super(item);
    }

    public Long getAnyUserId(){
        return null;
    }
    public void setAnyUserId(Long id){

    }
    public User getAnyUser(){
        return null;
    }
}
