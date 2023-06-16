package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.UserInfo;

/**
 * 用户信息
 *
 * @author senior
 */
@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {

}
