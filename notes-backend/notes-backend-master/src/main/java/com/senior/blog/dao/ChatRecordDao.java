package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.ChatRecord;

/**
 * 聊天记录
 *
 * @author senior
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
