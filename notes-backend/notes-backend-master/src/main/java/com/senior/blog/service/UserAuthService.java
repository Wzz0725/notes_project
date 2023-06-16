package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.UserAreaDTO;
import com.senior.blog.dto.UserBackDTO;
import com.senior.blog.entity.UserAuth;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.PageResult;
import com.senior.blog.vo.PasswordVO;
import com.senior.blog.vo.UserVO;

/**
 * 用户账号服务
 *
 * @author senior
 *
 */
public interface UserAuthService extends IService<UserAuth> {

    /**
     * 获取用户区域分布
     *
     * @param conditionVO 条件签证官
     * @return {@link List<UserAreaDTO>} 用户区域分布
     */
    List<UserAreaDTO> listUserAreas(ConditionVO conditionVO);

    /**
     * 用户注册
     *
     * @param user 用户对象
     */
    void register(UserVO user);

    /**
     * 修改密码
     *
     * @param user 用户对象
     */
    void updatePassword(UserVO user);

    /**
     * 修改管理员密码
     *
     * @param passwordVO 密码对象
     */
    void updateAdminPassword(PasswordVO passwordVO);

    /**
     * 查询后台用户列表
     *
     * @param condition 条件
     * @return 用户列表
     */
    PageResult<UserBackDTO> listUserBackDTO(ConditionVO condition);

}
