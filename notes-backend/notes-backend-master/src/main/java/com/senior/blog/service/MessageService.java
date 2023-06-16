package com.senior.blog.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.senior.blog.dto.MessageBackDTO;
import com.senior.blog.dto.MessageDTO;
import com.senior.blog.entity.Message;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.MessageVO;
import com.senior.blog.vo.PageResult;
import com.senior.blog.vo.ReviewVO;

/**
 * 留言服务
 *
 * @author senior
 *
 */
public interface MessageService extends IService<Message> {

    /**
     * 添加留言弹幕
     *
     * @param messageVO 留言对象
     */
    void saveMessage(MessageVO messageVO);

    /**
     * 查看留言弹幕
     *
     * @return 留言列表
     */
    List<MessageDTO> listMessages();

    /**
     * 审核留言
     *
     * @param reviewVO 审查签证官
     */
    void updateMessagesReview(ReviewVO reviewVO);

    /**
     * 查看后台留言
     *
     * @param condition 条件
     * @return 留言列表
     */
    PageResult<MessageBackDTO> listMessageBackDTO(ConditionVO condition);

}
