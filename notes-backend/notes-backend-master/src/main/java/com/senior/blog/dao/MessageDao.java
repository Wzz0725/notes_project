package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.Message;

/**
 * 留言
 *
 * @author senior
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {

}
