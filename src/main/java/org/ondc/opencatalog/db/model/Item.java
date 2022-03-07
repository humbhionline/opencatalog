package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.ATTRIBUTE_GROUP;
import com.venky.swf.db.annotations.column.IS_NULLABLE;
import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.indexing.Index;
import com.venky.swf.db.annotations.column.pm.PARTICIPANT;
import com.venky.swf.db.annotations.column.validations.Enumeration;
import com.venky.swf.db.annotations.model.MENU;
import com.venky.swf.db.model.Model;
import com.venky.swf.plugins.collab.db.model.CompanySpecific;
import com.venky.swf.plugins.collab.db.model.user.User;

import java.util.List;

@MENU("Catalog")
public interface Item extends Model,CompanySpecific {

    @PARTICIPANT("COMPANY")
    @IS_VIRTUAL
    public Long getAnyUserId();
    public void setAnyUserId(Long id);
    public User getAnyUser();


    @ATTRIBUTE_GROUP(("Price"))
    public Double getMaximum();
    public void setMaximum(Double maximum);

    @ATTRIBUTE_GROUP("Price")
    @Enumeration("INR")
    public String getCurrency();
    public void setCurrency(String currency);



    @ATTRIBUTE_GROUP("Tags")
    @UNIQUE_KEY
    @Index
    public String getModel();
    public void setModel(String model);

    @ATTRIBUTE_GROUP("Tags")
    @UNIQUE_KEY
    @Index
    public String getVariant();
    public void setVariant(String variant);

    @ATTRIBUTE_GROUP("Tags")
    @Index
    public String getAssetCode();
    public void setAssetCode(String assetCode);

    @ATTRIBUTE_GROUP("Tags")
    public String getCountryOfOrigin();
    public void setCountryOfOrigin(String countryOfOrigin);

    @ATTRIBUTE_GROUP("Tags")
    @Index
    public String[] getKeyWords();
    public void setKeyWords(String[] keyWords);

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
    @Index
    public String getName();
    public void setName(String name);

    @ATTRIBUTE_GROUP("Descriptor")
    @UNIQUE_KEY("SKU_CODE")
    @Index
    public String getCode();
    public void setCode(String code);


    @ATTRIBUTE_GROUP("Descriptor")
    @Index
    public String getShortDesc();
    public void setShortDesc(String shortDescription);

    @ATTRIBUTE_GROUP("Descriptor")
    @Index
    public String getLongDesc();
    public void setLongDesc(String longDescription);

    @IS_VIRTUAL
    @ATTRIBUTE_GROUP("Tags")
    public Double getGstPct();
    public void setGstPct(Double gstPct);

    @ATTRIBUTE_GROUP("Descriptor")
    public String[] getImages();
    public void setImages(String[] images);

    public List<Attachment> getAttachments();
}

