package org.ondc.opencatalog.extensions;

import com.venky.core.util.ObjectUtil;
import com.venky.swf.db.Database;
import com.venky.swf.db.annotations.column.DATA_TYPE;
import com.venky.swf.db.extensions.BeforeModelValidateExtension;
import com.venky.swf.plugins.collab.db.model.config.Country;
import com.venky.swf.plugins.gst.db.model.assets.AssetCode;
import org.ondc.opencatalog.db.model.Item;

import java.util.Arrays;

public class BeforeValidateItem extends BeforeModelValidateExtension<Item> {
    static {
        registerExtension(new BeforeValidateItem());
    }
    @Override
    public void beforeValidate(Item model) {
        if (!ObjectUtil.isVoid(model.getCountryOfOrigin())){
            Country country = Country.findByISO(model.getCountryOfOrigin());
            if (country == null){
                throw new RuntimeException("Invalid country code. Use 3 byte iso codes");
            }
        }
        if (ObjectUtil.isVoid(model.getCurrency())){
            model.setCurrency("INR");
        }
        if (!ObjectUtil.isVoid(model.getAssetCode())){
            AssetCode assetCode = AssetCode.find(model.getAssetCode());
            if (assetCode == null){
                assetCode = Database.getTable(AssetCode.class).newRecord();
                assetCode.setCode(model.getAssetCode());
                assetCode.setDescription(model.getAssetCode() +"-"+ Arrays.asList(model.getKeyWords()));
                assetCode.setGstPct(model.getGstPct());
                assetCode.save();
            }
        }

    }
}
