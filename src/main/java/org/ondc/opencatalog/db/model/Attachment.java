package org.ondc.opencatalog.db.model;

import com.venky.swf.db.annotations.column.IS_NULLABLE;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;

public interface Attachment extends com.venky.swf.plugins.attachment.db.model.Attachment {
    @UNIQUE_KEY
    @IS_NULLABLE(false)
    public Long getItemId();
    public void setItemId(Long id);
    public Item getItem();

}
