package com.senior.blog.dto;

import java.util.List;

import lombok.Data;

/**
 * 资源角色
 *
 * @author senior
 *
 */
@Data
public class ResourceRoleDTO {

    /**
     * 资源id
     */
    private Integer id;

    /**
     * 路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 角色名
     */
    private List<String> roleList;

}
