package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.model.Model;

public interface Price extends Model {
    @UNIQUE_KEY
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

    public Double getMaximum();
    public void setMaximum(Double maximum);

    public String getCurrency();
    public void setCurrency(String currency);

}
