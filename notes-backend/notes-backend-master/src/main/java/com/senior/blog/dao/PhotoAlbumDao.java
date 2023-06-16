package com.senior.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.blog.dto.PhotoAlbumBackDTO;
import com.senior.blog.entity.PhotoAlbum;
import com.senior.blog.vo.ConditionVO;

/**
 * 相册映射器
 *
 * @author senior
 */
@Repository
public interface PhotoAlbumDao extends BaseMapper<PhotoAlbum> {

    /**
     * 查询后台相册列表
     *
     * @param current 页码
     * @param size 大小
     * @param condition 条件
     * @return {@link List < PhotoAlbumBackDTO >} 相册列表
     */
    List<PhotoAlbumBackDTO> listPhotoAlbumBacks(@Param("current") Long current, @Param("size") Long size,
            @Param("condition") ConditionVO condition);

}
