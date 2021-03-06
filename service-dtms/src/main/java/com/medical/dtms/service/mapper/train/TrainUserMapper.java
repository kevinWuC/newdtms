package com.medical.dtms.service.mapper.train;

import com.medical.dtms.common.model.exam.ExamTotalModel;
import com.medical.dtms.common.model.train.MyTrainPageModel;
import com.medical.dtms.common.model.train.MyTrainTestModel;
import com.medical.dtms.common.model.train.TrainUserModel;
import com.medical.dtms.common.model.train.TrainUserQueryModel;
import com.medical.dtms.common.model.train.query.MyTrainPageQuery;
import com.medical.dtms.common.model.train.query.TrainSubmitAnswerQuery;
import com.medical.dtms.dto.train.TrainUserDTO;
import com.medical.dtms.dto.train.query.TrainUserQuery;
import com.medical.dtms.service.dataobject.train.TrainUserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version： TrainUserMapper.java v 1.0, 2019年08月20日 17:43  Exp$
 * @Description
 **/
@Repository
public interface TrainUserMapper {
    //培训
    List<TrainUserModel> pageListTrainUser(TrainUserQuery query);

    List<TrainUserModel> listTrainTimely(TrainUserQuery query);

    List<TrainUserModel> viewMyTrain(TrainUserQuery query);

    List<TrainUserQueryModel> listTrainExam(TrainUserQuery query);

    List<TrainUserModel> beginTrainExam(TrainUserQuery query);

    TrainUserDTO getTrainUserByCondition(@Param("trainUserId") Long bizId);

    int insert(List<TrainUserDO> dos);

    int deleteTrainUserByCondition(TrainUserDO userDO);

    List<TrainUserDO> listTrainUserByCondition(TrainUserQuery query);

    Integer addTrainUser(TrainUserDO dto);

    //考试
    List<ExamTotalModel> pageListExamTotal(TrainUserQuery query);

    TrainUserDO getTrainUserByPrimaryKey(TrainSubmitAnswerQuery query);

    MyTrainTestModel listExamIds(@Param("bizId") Long bizId);

    List<MyTrainPageModel> pageListMyTrain(MyTrainPageQuery query);

    Integer updateUserInfo(TrainUserDO dto);
}