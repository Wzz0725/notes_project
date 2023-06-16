package com.senior.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.OperationLogDTO;
import com.senior.blog.entity.OperationLog;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.PageResult;

/**
 * 操作日志服务
 *
 * @author senior
 *
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
