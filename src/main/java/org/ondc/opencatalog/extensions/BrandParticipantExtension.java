package org.ondc.opencatalog.extensions;

import com.venky.swf.db.extensions.ParticipantExtension;
import com.venky.swf.db.model.User;
import org.ondc.opencatalog.db.model.Brand;

import java.util.Arrays;
import java.util.List;

public class BrandParticipantExtension extends ParticipantExtension<Brand> {
    static {
        registerExtension(new BrandParticipantExtension());
    }
    @Override
    protected List<Long> getAllowedFieldValues(User user, Brand partiallyFilledModel, String fieldName) {
        if (fieldName.equals("MANAGER_ID")){
            return Arrays.asList(user.getId());
        }
        return null;
    }
}
