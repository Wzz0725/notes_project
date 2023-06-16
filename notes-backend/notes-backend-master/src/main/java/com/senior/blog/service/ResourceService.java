package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.LabelOptionDTO;
import com.senior.blog.dto.ResourceDTO;
import com.senior.blog.entity.Resource;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.ResourceVO;

/**
 * 资源服务
 *
 * @author senior
 *
 */
public interface ResourceService extends IService<Resource> {

    /**
     * 导入swagger权限
     */
    void importSwagger();

    /**
     * 添加或修改资源
     *
     * @param resourceVO 资源对象
     */
    void saveOrUpdateResource(ResourceVO resourceVO);

    /***
     * 删除资源
     *
     * @param resourceId 资源id
     */
    void deleteResource(Integer resourceId);

    /**
     * 查看资源列表
     *
     * @param conditionVO 条件
     * @return 资源列表
     */
    List<ResourceDTO> listResources(ConditionVO conditionVO);

    /**
     * 查看资源选项
     *
     * @return 资源选项
     */
    List<LabelOptionDTO> listResourceOption();

}
