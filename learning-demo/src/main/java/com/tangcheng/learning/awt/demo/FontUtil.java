package com.tangcheng.learning.awt.demo;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: tangcheng
 * @description:
 * @since: Created in 2018/06/29 19:56
 */
public class FontUtil {


    /**
     * 默认字体
     */
    public static final int DEFAULT_FONT = 1;
    /**
     * PingFangSC字体
     */
    public static final int PINGFANG_FONT = 2;
    /**
     * PingFangSCBold字体
     */
    public static final int PINGFANG_BOLD_FONT = 3;
    /**
     * 方正兰亭特黑GBK
     */
    public static final int FZLTTH_GBK_FONT = 4;


    /**
     * 根据字体类型获取字体
     * https://github.com/liuyanmin/picture-handle
     *
     * @param type
     * @param size
     * @return
     */
    public static Font getFont(int type, float size) {
        // 字体路径
        String path = "";
        switch (type) {
            case DEFAULT_FONT:
                path = "font/simhei.ttf";
                break;
            case PINGFANG_FONT:
                path = "font/PingFangSC.ttf";
                break;
            case PINGFANG_BOLD_FONT:
                path = "font/PingFangBold.ttf";
                break;
            case FZLTTH_GBK_FONT:
                path = "font/fzltthjwgb10.ttf";
                break;
            default:
                path = "font/simhei.ttf";
        }

        File file = new File(path);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            Font sPfBoldFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            sPfBoldFont = sPfBoldFont.deriveFont(size);
            return sPfBoldFont;
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
