package com.senior.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.dto.TagBackDTO;
import com.senior.blog.entity.Tag;
import com.senior.blog.vo.ConditionVO;

/**
 * 标签
 *
 * @author senior
 */
@Repository
public interface TagDao extends BaseMapper<Tag> {

    /**
     * 查询后台标签列表
     *
     * @param current 页码
     * @param size 大小
     * @param condition 条件
     * @return {@link List< TagBackDTO >} 标签列表
     */
    List<TagBackDTO> listTagBackDTO(@Param("current") Long current, @Param("size") Long size,
            @Param("condition") ConditionVO condition);

    /**
     * 根据文章id查询标签名
     *
     * @param articleId 文章id
     * @return {@link List<String>} 标签名列表
     */
    List<String> listTagNameByArticleId(Integer articleId);

}
