package com.senior.blog.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.base.Preconditions;
import com.senior.blog.vo.Result;

import io.swagger.annotations.Api;

/**
 * 图片(Image) Controller
 *
 * @author senior
 */
@Api(tags = "图片上传接口}")
@RestController
@RequestMapping("/admin/image")
public class ImageController {

    @RequestMapping(value = "/upload")
    public Result<String> upload(@RequestParam MultipartFile file, HttpServletRequest request) {
        InputStream in = null;
        String format = "data:%s;base64,";
        try {
            request.setCharacterEncoding("utf-8");
            byte[] data = new byte[file.getInputStream().available()];
            in = file.getInputStream();
            in.read(data);
            String contentType = file.getContentType().toLowerCase();
            Preconditions.checkArgument(contentType.contains("image"), "只允许上传图片");
            String prefix = String.format(format, contentType);
            String imageData = Base64.getEncoder().encodeToString(data);
            String base64Data = prefix + imageData;
            return Result.ok(base64Data);
        } catch (Exception e) {
            return Result.fail("图片上传失败");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

}
