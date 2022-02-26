package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.relationship.CONNECTED_VIA;
import com.venky.swf.db.model.Model;

import java.util.List;

public interface User extends Model {
    @CONNECTED_VIA("MANAGER_ID")
    public List<Brand> getManagedBrands();
}
