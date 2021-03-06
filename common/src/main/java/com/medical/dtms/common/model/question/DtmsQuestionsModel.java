package com.medical.dtms.common.model.question;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.medical.dtms.common.convert.LongJsonDeserializer;
import com.medical.dtms.common.convert.LongJsonSerializer;

import lombok.Data;

/**
 * 试卷管理
 * 
 * @author shenqifeng
 * @version $Id: DtmsQuestionsModel.java, v 0.1 2019年8月27日 下午5:18:16 shenqifeng Exp $
 */
@Data
public class DtmsQuestionsModel {

    /**试题id*/
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long   bizId;
    /**培训类别*/
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long   examTypeId;
    /**试题库类别*/
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long   questionsBankTypeId;
    /**试题类别*/
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long   questionsTypeId;
    /**试题题目*/
    private String questionTitle;
    /**试题内容*/
    private String questionContent;
    /**A答案*/
    private String questionA;
    /**B答案*/
    private String questionB;
    /**C答案*/
    private String questionC;
    /**D答案*/
    private String questionD;
    /**E答案*/
    private String questionE;
    /**F答案*/
    private String questionF;
    /**答案*/
    private String answer;
    /**用户答案*/
    private String userAnswer;
    /**用户得分*/
    private Integer userPoints;
    /**是否删除*/
    private Boolean deleted;
    /**是否使用*/
    private Boolean isUsed;
    /**附件*/
    private String  imgs;
    /**源地址*/
    private String  sourceUrl;
    /***/
    private String  examExplain;

}