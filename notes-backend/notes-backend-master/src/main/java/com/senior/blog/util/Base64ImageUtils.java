
package com.senior.blog.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * @author senior
 * @version 2021-10-31
 */
public class Base64ImageUtils {

    /**
     * 图片转base64
     *
     * @param inputStream
     * @param imageType
     * @return
     * @throws IOException
     */
    public static String toBase64(InputStream inputStream, String imageType) {
        try {
            byte[] data = new byte[inputStream.available()];
            String format = "data:%s;base64,";
            inputStream.read(data);
            String prefix = String.format(format, StringUtils.isBlank(imageType) ? "jpg" : imageType);
            String imageData = Base64.getEncoder().encodeToString(data);
            return prefix + imageData;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
