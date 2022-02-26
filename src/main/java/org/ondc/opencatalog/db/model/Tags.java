package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.model.Model;

public interface Tags extends Model {
    @UNIQUE_KEY
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

    public String getBrand();
    public void setBrand(String brand);

    public String getModel();
    public void setModel(String model);

    public String getVariant();
    public void setVariant(String variant);

    public String getAssetCode();
    public void setAssetCode(String assetCode);

    public String getCountryOfOrigin();
    public void setCountryOfOrigin(String countryOfOrigin);

}
