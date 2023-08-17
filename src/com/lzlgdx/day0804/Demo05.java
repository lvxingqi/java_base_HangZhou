package com.lzlgdx.day0804;

import java.util.Arrays;
import java.util.Collections;

/**
 * @className: Demo05.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 下午 05:49
 * @Description:
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr={89,24,65,4,1,2,3,4};
        //默认升序排列
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //降序排列
        Integer[] arr1={89,24,65,4,1,2,3,4};
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }
}
