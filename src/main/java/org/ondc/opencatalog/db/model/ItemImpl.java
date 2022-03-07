package org.ondc.opencatalog.db.model;

import com.venky.swf.db.table.ModelImpl;
import com.venky.swf.plugins.collab.db.model.user.User;
import com.venky.swf.plugins.gst.db.model.assets.AssetCode;

import java.util.List;

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

    Double taxRate = null;
    public Double getGstPct() {
        if (taxRate == null) {
            Item proxy = getProxy();
            if (proxy.getReflector().isVoid(proxy.getAssetCode())) {
                return null;
            }
            AssetCode assetCode = AssetCode.find(proxy.getAssetCode());
            if (assetCode != null) {
                taxRate = assetCode.getGstPct();
            }
        }
        return taxRate;
    }
    public void setGstPct(Double gstPct){
        this.taxRate = gstPct;
    }

    List<String> images = null;
    public void setImages(List<String> images){
        this.images = images;
    }
    public List<String> getImages(){
        return this.images;
    }
}
