package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.UniqueViewDTO;
import com.senior.blog.entity.UniqueView;

/**
 * 用户量统计
 *
 * @author senior
 *
 */
public interface UniqueViewService extends IService<UniqueView> {

    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();

}
