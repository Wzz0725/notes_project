package com.senior.blog.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senior.blog.dao.WebsiteConfigDao;
import com.senior.blog.entity.WebsiteConfig;
import com.senior.blog.service.WebsiteConfigService;

/**
 * 网站配置服务
 *
 * @author senior
 */
@Service
public class WebsiteConfigServiceImpl extends ServiceImpl<WebsiteConfigDao, WebsiteConfig>
        implements WebsiteConfigService {

}
