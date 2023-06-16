package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.FriendLinkBackDTO;
import com.senior.blog.dto.FriendLinkDTO;
import com.senior.blog.entity.FriendLink;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.FriendLinkVO;
import com.senior.blog.vo.PageResult;

/**
 * 友链服务
 *
 * @author senior
 *
 */
public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
