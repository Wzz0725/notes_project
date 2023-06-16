package com.senior.blog.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.entity.ArticleTag;

/**
 * 文章标签
 *
 * @author senior
 */
@Repository
public interface ArticleTagDao extends BaseMapper<ArticleTag> {

}
