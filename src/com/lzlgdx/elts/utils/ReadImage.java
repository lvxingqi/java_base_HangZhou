package com.lzlgdx.elts.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 09:39
 * @Description
 */
public class ReadImage {
    public static BufferedImage readImage(String pathname){
        try {
            return ImageIO.read(new File(pathname));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
