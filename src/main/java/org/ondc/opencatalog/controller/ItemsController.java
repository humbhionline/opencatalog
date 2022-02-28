package org.ondc.opencatalog.controller;

import com.venky.swf.db.model.Model;
import com.venky.swf.db.model.reflection.ModelReflector;
import com.venky.swf.path.Path;
import org.ondc.opencatalog.db.model.Brand;
import org.ondc.opencatalog.db.model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ItemsController extends CatalogController<Item> {
    public ItemsController(Path path) {
        super(path);
    }

    @Override
    protected Map<Class<? extends Model>, List<String>> getIncludedModelFields() {
        Map<Class<? extends Model>,List<String>> map = super.getIncludedModelFields();
        if (map.isEmpty() && getReturnIntegrationAdaptor() != null){
            map.put(Item.class,getReflector().getVisibleFields(Collections.singletonList("ID")));
            map.put(Brand.class, Collections.singletonList("NAME"));
        }
        return map;
    }
}
