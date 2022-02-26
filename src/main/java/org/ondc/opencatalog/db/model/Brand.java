package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.pm.PARTICIPANT;
import com.venky.swf.db.model.Model;

public interface Brand extends Model {
    public String getName();
    public void setName(String name);

    @PARTICIPANT
    public long getManagerId();
    public void setManagerId(long id);
    public User getManager();

    @PARTICIPANT
    @IS_VIRTUAL
    public Long getAnyUserId();
    public void setAnyUserId(Long id);
    public User getAnyUser();

}
