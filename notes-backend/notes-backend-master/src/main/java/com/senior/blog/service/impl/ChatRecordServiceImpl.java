package com.senior.blog.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senior.blog.dao.ChatRecordDao;
import com.senior.blog.entity.ChatRecord;
import com.senior.blog.service.ChatRecordService;

/**
 * 聊天记录服务
 *
 * @author senior
 *
 */
@Service
public class ChatRecordServiceImpl extends ServiceImpl<ChatRecordDao, ChatRecord> implements ChatRecordService {

}
