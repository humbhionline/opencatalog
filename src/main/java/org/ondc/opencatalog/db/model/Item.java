package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.pm.PARTICIPANT;
import com.venky.swf.db.annotations.column.ui.HIDDEN;
import com.venky.swf.db.model.Model;

import java.util.List;

public interface Item extends Model {
    @HIDDEN
    @PARTICIPANT
    public Long getBrandId();
    public void setBrandId(Long id);
    public Brand getBrand();

    @IS_VIRTUAL
    public Long getPriceId();
    public Price getPrice();

    @IS_VIRTUAL
    public Long getDescriptorId();
    public Descriptor getDescriptor();

    @IS_VIRTUAL
    public Long getTagsId();
    public Tags getTags();


    @HIDDEN
    public List<Price> getPriceList();

    @HIDDEN
    public List<Tags> getTagsList();

    @HIDDEN
    public List<Descriptor> getDescriptorList();

}

