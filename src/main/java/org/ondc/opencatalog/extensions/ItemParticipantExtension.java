package org.ondc.opencatalog.extensions;

import com.venky.swf.db.extensions.ParticipantExtension;
import com.venky.swf.db.model.User;
import org.ondc.opencatalog.db.model.Brand;
import org.ondc.opencatalog.db.model.Item;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemParticipantExtension extends ParticipantExtension<Item> {
    static {
        registerExtension(new ItemParticipantExtension());
    }
    @Override
    protected List<Long> getAllowedFieldValues(User user, Item partiallyFilledModel, String fieldName) {
        if (fieldName.equals("BRAND_ID")){
            return user.getRawRecord().getAsProxy(org.ondc.opencatalog.db.model.User.class).getManagedBrands().stream().map(Brand::getManagerId).collect(Collectors.toList());
        }
        return null;
    }
}
