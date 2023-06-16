package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.Photo;

/**
 * 照片映射器
 *
 * @author senior
 */
@Repository
public interface PhotoDao extends BaseMapper<Photo> {

}
