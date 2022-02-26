package org.ondc.opencatalog.db.model;

import com.venky.swf.db.table.ModelImpl;

public class BrandImpl extends ModelImpl<Brand> {
    public BrandImpl(Brand brand){
        super(brand);
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
