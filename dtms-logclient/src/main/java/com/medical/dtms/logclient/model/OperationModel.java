package com.medical.dtms.logclient.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class OperationModel {
    private Integer id;
    private String appName;
    private String objectName;
    private Long objectId;
    private String operator;
    private String operationName;
    private String operationAlias;
    private String extraWords;
    private String comment;
    private Date operationTime;
    private List<AttributeModel> attributeModelList = new ArrayList<AttributeModel>();

    public OperationModel() {
    }

    public OperationModel(String appName, String objectName, Long objectId, String operator,
                          String operationName, String operationAlias, String extraWords,
                          String comment, Date operationTime) {
        this.appName = appName;
        this.objectName = objectName;
        this.objectId = objectId;
        this.operator = operator;
        this.operationName = operationName;
        this.operationAlias = operationAlias;
        this.extraWords = extraWords;
        this.comment = comment;
        this.operationTime = operationTime;
    }

    public void addBaseActionItemModelList(List<BaseAttributeModel> baseAttributeModelList) {
        for (BaseAttributeModel baseAttributeModel : baseAttributeModelList) {
            addBaseActionItemModel(baseAttributeModel);
        }
    }

    public void addBaseActionItemModel(BaseAttributeModel baseAttributeModel) {
        AttributeModel attributeModel = new AttributeModel(baseAttributeModel);
        this.getAttributeModelList().add(attributeModel);
    }
}
