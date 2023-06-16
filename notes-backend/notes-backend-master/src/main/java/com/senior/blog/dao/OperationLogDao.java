package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.OperationLog;

/**
 * 操作日志
 *
 * @author senior
 *
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}
