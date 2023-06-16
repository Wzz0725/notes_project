package com.senior.blog.handler;

import static com.senior.blog.enums.ZoneEnum.SHANGHAI;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import lombok.extern.log4j.Log4j2;

/**
 * mybatis plus自动填充
 *
 * @author senior
 **/
@Log4j2
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class,
                LocalDateTime.now(ZoneId.of(SHANGHAI.getZone())));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class,
                LocalDateTime.now(ZoneId.of(SHANGHAI.getZone())));
    }

}
