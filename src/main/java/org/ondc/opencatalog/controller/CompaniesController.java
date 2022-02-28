package org.ondc.opencatalog.controller;

import com.venky.swf.db.model.Model;
import com.venky.swf.path.Path;
import org.ondc.opencatalog.db.model.Brand;
import org.ondc.opencatalog.db.model.Company;
import org.ondc.opencatalog.db.model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CompaniesController extends CatalogController<Company> {
    public CompaniesController(Path path) {
        super(path);
    }


}
