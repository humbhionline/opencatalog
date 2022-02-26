package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.model.Model;

public interface Descriptor extends Model {
    @UNIQUE_KEY
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

    public String getName();
    public void setName(String name);

    public String getCode();
    public void setCode(String code);

    public String getShortCode();
    public void setShortCode(String shortCode);

    public String getShortDescription();
    public void setShortDescription(String shortDescription);

    public String getLongDescription();
    public void setLongDescription(String longDescription);

    
}
