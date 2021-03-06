package com.medical.dtms.dto.train;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.medical.dtms.common.convert.LongJsonDeserializer;
import com.medical.dtms.common.convert.LongJsonSerializer;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @version： TrainUserDTO.java v 1.0, 2019年08月14日 10:52  Exp$
 * @Description 培训用户表
 **/
@Data

public class TrainUserDTO {
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
     * 培训id
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long trainId;
    /**
     * 用户id
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long userId;
    /**
     * 用户id 集合
     */
    private List<Long> userIdList;
    /**
     * 文件阅读
     */
    private Boolean isFinishFile;
    /**
     * 阅读用时
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date readTime;
    /**
     * 培训阶段 ，-1未开始0正进行1已完成
     */
    private Integer state;
    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date beginTime;
    /**
     * 答案
     */
    private String answer;
    /**
     * 内容
     */
    private String des;
    /**
     * 考试开始时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date startDate;
    /**
     * 考试结束时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date endDate;
    /**
     * 完成时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date finishTime;
    /**
     * 是否完成试题
     */
    private Boolean isFinishQuestions;
    /**
     * 培训名称
     */
    private String trainName;
    /**
     * 培训类型id
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long typeId;
    /**
     * 培训考试分数
     */
    private Integer userExamTotal;
    /**
     * 得分
     */
    private String pointStr;
    /**
     * 参加培训人数
     */
    private Integer trainTotal;
    /**
     * 培训及时人数
     */
    private Integer timelyTotal;
    /**
     * 培训及时率
     */
    private Integer timelinessRate;
    /**
     * 开始阅读时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date startReadTime;
    /**
     * 是否删除 0 否 1是
     */
    private Boolean isDeleted;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 创建者id
     */
    private String creatorId;
    /**
     * 创建日期
     */
    private Date gmtCreated;
    /**
     * 修改者
     */
    private String modifier;
    /**
     * 修改者Id
     */
    private String modifierId;
    /**
     * 修改日期
     */
    private Date gmtModified;
    /**
     * 用户姓名
     */
    private String dspName;
    /**
     * 部门名称
     */
    private String deptName;
    /** 用户 id 集合*/
    private List<Long> userIds;
    /** 问题类型 id 集合*/
    private List<Long> questionsTypeIds;
    /**
     * 试卷id
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long examId;
    /**
     * 考试时长
     */
    private Integer examDuration;
    /**
     * 及格分数
     */
    private Integer passPoint;
    /**
     * 总分
     */
    private Integer totalPoints;
    /**
     * 试题类别
     */
    private Long questionsTypeId;
    /**
     * 试题类别 name
     */
    private String questionsTypeName;
    /**
     * 试题题目
     */
    private String questionTitle;
    /**
     * 试题内容
     */
    private String questionContent;
    /**
     * A答案
     */
    private String questionA;
    /**
     * B答案
     */
    private String questionB;
    /**
     * C答案
     */
    private String questionC;
    /**
     * D答案
     */
    private String questionD;
    /**
     * E答案
     */
    private String questionE;
    /**
     * F答案
     */
    private String questionF;
    /**
     * 是否结束
     * */
    private Boolean isFinish;
    /**
     * 培训用户ID
     **/
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long trainUserId;
    /**得分*/
    private Integer baseTotalPoints;
}