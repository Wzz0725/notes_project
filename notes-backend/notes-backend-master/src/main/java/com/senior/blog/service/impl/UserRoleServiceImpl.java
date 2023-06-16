package com.senior.blog.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senior.blog.dao.UserRoleDao;
import com.senior.blog.entity.UserRole;
import com.senior.blog.service.UserRoleService;

/**
 * 用户角色服务
 *
 * @author senior
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}
