package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.relationship.CONNECTED_VIA;
import com.venky.swf.db.annotations.model.MENU;

import java.util.List;

@MENU("Admin")
public interface Company extends com.venky.swf.plugins.collab.db.model.participants.admin.Company {

    @CONNECTED_VIA("COMPANY_ID")
    public List<Brand> getBrands();
}
