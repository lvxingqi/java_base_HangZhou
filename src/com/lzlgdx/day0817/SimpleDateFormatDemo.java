package com.lzlgdx.day0817;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 上午 09:37
 * @since jdk1.0
 */
//演示simpleDateFormat的使用
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //构造函数定义format的规则，
        //yyyy 年份 MM月份 dd 天数
        //HH 时(24小时制) hh(12小时制) mm 分 ss 秒
        // E 星期
        // a am pm 上下午
        String pattern="HH:mm:ss E a";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        //日期转文本
        String str=simpleDateFormat.format(new Date());
        System.out.println(str);
        String format = sdf.format(new Date());
        System.out.println(format);

        //文本转日期
        Date parse = simpleDateFormat.parse("2020-12-01");
        System.out.println(parse);

        //不论日期转文本还是文本转日期，都是按照构造方法里面的模式进行的
    }
}
