package com.senior.blog.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senior.blog.dao.ArticleTagDao;
import com.senior.blog.entity.ArticleTag;
import com.senior.blog.service.ArticleTagService;

/**
 * 文章标签服务
 *
 * @author senior
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
