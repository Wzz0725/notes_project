package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.Resource;

/**
 * 资源
 *
 * @author senior
 */
@Repository
public interface ResourceDao extends BaseMapper<Resource> {

}
