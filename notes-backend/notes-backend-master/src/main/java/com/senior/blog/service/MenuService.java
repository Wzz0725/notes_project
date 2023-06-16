package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.LabelOptionDTO;
import com.senior.blog.dto.MenuDTO;
import com.senior.blog.dto.UserMenuDTO;
import com.senior.blog.entity.Menu;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.MenuVO;

/**
 * 菜单服务
 *
 * @author senior
 *
 */
public interface MenuService extends IService<Menu> {

    /**
     * 查看菜单列表
     *
     * @param conditionVO 条件
     * @return 菜单列表
     */
    List<MenuDTO> listMenus(ConditionVO conditionVO);

    /**
     * 新增或修改菜单
     *
     * @param menuVO 菜单信息
     */
    void saveOrUpdateMenu(MenuVO menuVO);

    /**
     * 删除菜单
     *
     * @param menuId 菜单id
     */
    void deleteMenu(Integer menuId);

    /**
     * 查看角色菜单选项
     *
     * @return 角色菜单选项
     */
    List<LabelOptionDTO> listMenuOptions();

    /**
     * 查看用户菜单
     *
     * @return 菜单列表
     */
    List<UserMenuDTO> listUserMenus();

}
