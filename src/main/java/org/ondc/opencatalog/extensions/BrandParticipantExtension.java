package org.ondc.opencatalog.extensions;

import com.venky.swf.db.model.User;
import com.venky.swf.plugins.collab.extensions.participation.CompanySpecificParticipantExtension;
import org.ondc.opencatalog.db.model.Brand;

import java.util.Arrays;
import java.util.List;

public class BrandParticipantExtension extends CompanySpecificParticipantExtension<Brand>{
    static {
        registerExtension(new BrandParticipantExtension());
    }
    @Override
    protected List<Long> getAllowedFieldValues(User user, Brand partiallyFilledModel, String fieldName) {
        if (fieldName.equals("MANAGER_ID")){
            if (user.getRawRecord().getAsProxy(org.ondc.opencatalog.db.model.User.class).isStaff()) {
                return null;
            }else {
                return Arrays.asList(user.getId());
            }
        }
        return super.getAllowedFieldValues(user,partiallyFilledModel,fieldName);
    }
}
