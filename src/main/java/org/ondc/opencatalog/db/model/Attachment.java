package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;

public interface Attachment extends com.venky.swf.plugins.attachment.db.model.Attachment {
    @UNIQUE_KEY
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

}
