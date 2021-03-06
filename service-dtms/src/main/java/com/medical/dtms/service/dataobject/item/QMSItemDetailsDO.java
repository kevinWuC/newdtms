package com.medical.dtms.service.dataobject.item;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.medical.dtms.common.convert.LongJsonDeserializer;
import com.medical.dtms.common.convert.LongJsonSerializer;
import com.medical.dtms.logclient.annotation.LogTag;
import com.medical.dtms.logclient.handler.BuiltinTypeHandler;
import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @version： QMSItemDetailsDO.java v 1.0, 2019年08月14日 10:52 wuxuelin Exp$
 * @Description 数据字典明细表
 **/
@Data
@Table(name = "tb_dtms_qms_item_details")
public class QMSItemDetailsDO {
    private Long id;

    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    @LogTag(alias = "bizId", builtinType = BuiltinTypeHandler.NORMAL)
    private Long bizId;
    @LogTag(alias = "itemsId", builtinType = BuiltinTypeHandler.NORMAL)
    private Long itemsId;
    @LogTag(alias = "itemName", builtinType = BuiltinTypeHandler.NORMAL)
    private String itemName;
    @LogTag(alias = "itemCode", builtinType = BuiltinTypeHandler.NORMAL)
    private String itemCode;
    @LogTag(alias = "description", builtinType = BuiltinTypeHandler.NORMAL)
    private String description;
    @LogTag(alias = "enabled", builtinType = BuiltinTypeHandler.NORMAL)
    private Boolean enabled;
    @LogTag(alias = "allowEdit", builtinType = BuiltinTypeHandler.NORMAL)
    private Boolean allowEdit;
    @LogTag(alias = "allowDelete", builtinType = BuiltinTypeHandler.NORMAL)
    private Boolean allowDelete;
    @LogTag(alias = "sortCode", builtinType = BuiltinTypeHandler.NORMAL)
    private String sortCode;
    @LogTag(alias = "isDeleted", builtinType = BuiltinTypeHandler.NORMAL)
    private Boolean isDeleted;

    private String creator;

    private String creatorId;

    private Date gmtCreated;

    private String modifier;

    private String modifierId;

    private Date gmtModified;
}