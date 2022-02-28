package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.pm.PARTICIPANT;
import com.venky.swf.db.annotations.column.ui.HIDDEN;
import com.venky.swf.db.annotations.model.MENU;
import com.venky.swf.db.model.Model;
import com.venky.swf.plugins.collab.db.model.CompanySpecific;

import java.util.List;

@MENU("Admin")
public interface Brand extends Model , CompanySpecific {
    @PARTICIPANT("COMPANY")
    @IS_VIRTUAL
    @HIDDEN
    public Long getAnyCompanyId();
    public void setAnyCompanyId(Long id);
    public Company getAnyCompany();

    @UNIQUE_KEY
    public String getName();
    public void setName(String name);

    @PARTICIPANT
    public long getManagerId();
    public void setManagerId(long id);
    public User getManager();

    @PARTICIPANT
    @IS_VIRTUAL
    @HIDDEN
    public Long getAnyUserId();
    public void setAnyUserId(Long id);
    public User getAnyUser();

    public List<Item> getItems();
}
