package com.medical.dtms.feignservice.train;

import com.github.pagehelper.PageInfo;
import com.medical.dtms.common.model.exam.ExamExcelModel;
import com.medical.dtms.common.model.exam.ExamTotalModel;
import com.medical.dtms.common.model.train.MyTrainTestModel;
import com.medical.dtms.common.model.train.TrainExcelModel;
import com.medical.dtms.common.model.train.TrainUserModel;
import com.medical.dtms.common.model.train.TrainUserQueryModel;
import com.medical.dtms.dto.train.query.TrainUserQuery;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @version： TrainUserService.java v 1.0, 2019年08月20日 17:39  Exp$
 * @Description
 **/
@FeignClient("service-dtms")
public interface TrainUserService {
    //培训
    @RequestMapping(value = "/train/pageListTrainUser", method = RequestMethod.POST)
    PageInfo<TrainUserModel> pageListTrainUser(@RequestBody TrainUserQuery query);

    @RequestMapping(value = "/train/exportTrain", method = RequestMethod.POST)
    List<TrainExcelModel> exportTrain(@RequestBody TrainUserQuery query);

    @RequestMapping(value = "/train/listTrainTimely", method = RequestMethod.POST)
    PageInfo<TrainUserModel> listTrainTimely(@RequestBody TrainUserQuery query);

    @RequestMapping(value = "/train/viewMyTrain", method = RequestMethod.POST)
    MyTrainTestModel viewMyTrain(@RequestBody TrainUserQuery query);

    @RequestMapping(value = "/train/listTrainExam", method = RequestMethod.POST)
    PageInfo<TrainUserQueryModel> listTrainExam(@RequestBody TrainUserQuery query);

    //考试
    @RequestMapping(value = "/train/pageListExamTotal", method = RequestMethod.POST)
    PageInfo<ExamTotalModel> pageListExamTotal(@RequestBody TrainUserQuery query);

    @RequestMapping(value = "/train/exportExam", method = RequestMethod.POST)
    List<ExamExcelModel> exportExam(@RequestBody TrainUserQuery query);
}
