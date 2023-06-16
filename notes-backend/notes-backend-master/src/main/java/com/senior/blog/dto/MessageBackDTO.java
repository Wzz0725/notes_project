package com.senior.blog.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台留言
 *
 * @author senior
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageBackDTO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户ip
     */
    private String ipAddress;

    /**
     * 用户ip地址
     */
    private String ipSource;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 留言内容
     */
    private String messageContent;

    /**
     * 是否审核
     */
    private Integer isReview;

    /**
     * 留言时间
     */
    private LocalDateTime createTime;

}
