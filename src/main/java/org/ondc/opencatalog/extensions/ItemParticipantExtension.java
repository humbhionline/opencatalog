package org.ondc.opencatalog.extensions;

import com.venky.swf.plugins.collab.extensions.participation.CompanySpecificParticipantExtension;
import org.ondc.opencatalog.db.model.Item;

import java.util.List;

public class ItemParticipantExtension extends CompanySpecificParticipantExtension<Item> {
    static {
        registerExtension(new ItemParticipantExtension());
    }
}
