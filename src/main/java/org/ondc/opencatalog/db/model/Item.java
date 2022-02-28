package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.ATTRIBUTE_GROUP;
import com.venky.swf.db.annotations.column.IS_NULLABLE;
import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.pm.PARTICIPANT;
import com.venky.swf.db.annotations.column.validations.Enumeration;
import com.venky.swf.db.annotations.model.MENU;
import com.venky.swf.db.model.Model;

@MENU("Catalog")
public interface Item extends Model {
    @PARTICIPANT
    @UNIQUE_KEY("K1,SKU")
    public Long getBrandId();
    public void setBrandId(Long id);
    public Brand getBrand();

    @PARTICIPANT
    @IS_VIRTUAL
    public Long getAnyUserId();
    public void setAnyUserId(Long id);
    public User getAnyUser();

    @ATTRIBUTE_GROUP(("Price"))
    public Double getMaximum();
    public void setMaximum(Double maximum);

    @ATTRIBUTE_GROUP("Price")
    public String getCurrency();
    public void setCurrency(String currency);



    @ATTRIBUTE_GROUP("Tags")
    @UNIQUE_KEY
    public String getModel();
    public void setModel(String model);

    @ATTRIBUTE_GROUP("Tags")
    @UNIQUE_KEY
    public String getVariant();
    public void setVariant(String variant);

    @ATTRIBUTE_GROUP("Tags")
    public String getAssetCode();
    public void setAssetCode(String assetCode);

    @ATTRIBUTE_GROUP("Tags")
    public String getCountryOfOrigin();
    public void setCountryOfOrigin(String countryOfOrigin);

    @ATTRIBUTE_GROUP("Tags")
    public String getKeyWords();
    public void setKeyWords(String keyWords);

    @ATTRIBUTE_GROUP("Tags")
    public Double getShelfLifeInDays();
    public void setShelfLifeInDays(Double selfLifeInDays);

    @ATTRIBUTE_GROUP("Tags")
    public Boolean isRefrigerationRequired();
    public void setRefrigerationRequired(Boolean refrigerationRequired);

    @ATTRIBUTE_GROUP("Tags")
    @Enumeration(value = " ,RED,GREEN")
    @IS_NULLABLE
    public String getColorOfTheDot();
    public void setColorOfTheDot(String colorOfTheDot);


    @ATTRIBUTE_GROUP("Descriptor")
    @UNIQUE_KEY("SKU")
    public String getName();
    public void setName(String name);

    @ATTRIBUTE_GROUP("Descriptor")
    @UNIQUE_KEY("SKU_CODE")
    public String getCode();
    public void setCode(String code);


    @ATTRIBUTE_GROUP("Descriptor")
    public String getShortDesc();
    public void setShortDesc(String shortDescription);

    @ATTRIBUTE_GROUP("Descriptor")
    public String getLongDesc();
    public void setLongDesc(String longDescription);


}

