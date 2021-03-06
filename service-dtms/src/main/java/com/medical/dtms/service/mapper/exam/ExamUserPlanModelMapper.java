package com.medical.dtms.service.mapper.exam;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.medical.dtms.dto.exam.ExamUserPlanModelDTO;
import com.medical.dtms.dto.exam.query.ExamPlanModelQuery;
import com.medical.dtms.service.dataobject.exam.ExamUserPlanModelDO;

@Repository
public interface ExamUserPlanModelMapper {
    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    Integer insertBatchExamUserPlanModel(List<ExamUserPlanModelDO> list);

    /**
     * 重新安排考试
     *
     * @param list
     * @return
     */
    Integer insertBatchExamUserPlanModelForAfresh(List<ExamUserPlanModelDO> list);

    /**
     * 修改
     *
     * @param examUserPlanModelDO
     * @return
     */
    Integer updateExamUserPlanModel(ExamUserPlanModelDO examUserPlanModelDO);

    /**
     * 启动
     *
     * @param examPlanId
     * @return
     */
    Integer updateStart(@Param("examPlanId") Long examPlanId);

    /**
     * 根据考试安排id  删除
     *
     * @param examPlanId
     * @return
     */
    Integer deleteByExamPlanId(@Param("examPlanId") Long examPlanId);

    /**
     * 分页查询
     *
     * @param query
     * @return
     */
    List<ExamUserPlanModelDTO> listExamUserPlanByQuery(ExamPlanModelQuery query);

    /**
     * 分页查询（批卷用）
     *
     * @param query
     * @return
     */
    List<ExamUserPlanModelDTO> listExamUserPlanByQueryForMark(ExamPlanModelQuery query);

    /**
     * 根据用户考试bizId查询用户考试信息
     *
     * @param bizId
     * @return
     */
    ExamUserPlanModelDTO selectExamUserPlanModelByBizId(@Param("examUserPlanModelId") Long bizId);

    /**
     * 根据用户ID和考试ID删除用户和考试的关联
     *
     * @param dos
     * @return
     */
    Integer deleteBatchByCondition(List<ExamUserPlanModelDO> dos);

    /**
     * 主键查询考试信息
     */
    ExamUserPlanModelDO selectByPrimaryKey(@Param("examUserPlanModelId") Long bizId);
}