package org.ondc.opencatalog.db.model;

import com.venky.swf.plugins.attachment.db.model.Attachment;

public interface Image extends Attachment {
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

}
