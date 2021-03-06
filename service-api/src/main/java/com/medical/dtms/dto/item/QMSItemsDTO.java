package com.medical.dtms.dto.item;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.medical.dtms.common.convert.LongJsonDeserializer;
import com.medical.dtms.common.convert.LongJsonSerializer;
import lombok.Data;

import java.util.Date;

/**
 * @version： QMSItemsDTO.java v 1.0, 2019年08月14日 10:52 wuxuelin Exp$
 * @Description 数据字典主表
 **/
@Data
public class QMSItemsDTO{
    /**
     * 自增主键
     */
    private Long id;
    /**
     * 业务主键
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long bizId;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String fullName;
    /**
     * 父节点主键
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long parentId;
    /**
     * 分类
     */
    private String category;
    /**
     * 树型结构
     */
    private Integer isTree;
    /**
     * 有效：true - 有效，false - 无效
     */
    private Boolean enabled;
    /**
     * 允许编辑
     */
    private Boolean allowEdit;
    /**
     * 允许删除
     */
    private Boolean allowDelete;
    /**
     * 排序码
     */
    private String sortCode;
    /**
     * 删除标记: false - 正常，true - 删除
     */
    private Boolean isDeleted;
    /**
     * 创建用户
     */
    private String creator;
    /**
     * 创建用户主键
     */
    private String creatorId;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 修改用户
     */
    private String modifier;
    /**
     * 修改用户主键
     */
    private String modifierId;
    /**
     * 修改时间
     */
    private Date gmtModified;
}