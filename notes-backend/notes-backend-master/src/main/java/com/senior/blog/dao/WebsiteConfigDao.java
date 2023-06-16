package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.WebsiteConfig;

/**
 * 网站配置
 *
 * @author senior
 */
@Repository
public interface WebsiteConfigDao extends BaseMapper<WebsiteConfig> {

}
