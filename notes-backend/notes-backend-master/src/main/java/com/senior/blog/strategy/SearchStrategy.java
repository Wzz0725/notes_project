package com.senior.blog.strategy;

import java.util.List;

import com.senior.blog.dto.ArticleSearchDTO;

/**
 * 搜索策略
 *
 * @author senior
 *
 */
public interface SearchStrategy {

    /**
     * 搜索文章
     *
     * @param keywords 关键字
     * @return {@link List<ArticleSearchDTO>} 文章列表
     */
    List<ArticleSearchDTO> searchArticle(String keywords);

}
