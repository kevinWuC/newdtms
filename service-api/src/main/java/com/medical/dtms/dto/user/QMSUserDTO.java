package com.medical.dtms.dto.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.medical.dtms.common.convert.LongJsonDeserializer;
import com.medical.dtms.common.convert.LongJsonSerializer;
import lombok.Data;

import java.util.Date;

/**
 * @version： QMSUserDTO.java v 1.0, 2019年08月14日 10:52 wuxuelin Exp$
 * @Description 用户表
 **/
@Data
public class QMSUserDTO {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 业务主键
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long bizId;
    /**
     * 用户账号
     */
    private String account;
    /**
     * 用户姓名
     */
    private String dspName;
    /**
     * 部门ID
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long deptId;
    /**
     * 角色ID
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long roleId;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 是否启用 true 是 false 否
     */
    private Boolean allowEnable;
    /**
     * 是否保持登录 true 是 false 否
     */
    private Boolean keepLogin;
    /**
     * 排序码
     */
    private String sortCode;
    /**
     * 登录次数
     */
    private Integer logOnCount;
    /**
     * 前一次访问时间
     */
    private Date previousVisit;
    /**
     * 最后一次访问时间
     */
    private Date lastVisit;
    /**
     * 电话
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * QQ
     */
    private String qq;
    /**
     * 微信
     */
    private String wx;
    /**
     * false-未删除  true-删除
     */
    private Boolean isDeleted;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建人id
     */
    private String creatorId;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 修改人id
     */
    private String modifierId;
    /**
     * 修改时间
     */
    private Date gmtModified;
}