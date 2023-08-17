package com.lzlgdx.test.sort;

import org.junit.Test;

/**
 * @version java基础.1.0
 * @Description: 测试各种排序方法
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 10:26
 */
public class SortTest {
    static SqList sqList=new SqList();
    public static void addSomeData(){
        sqList.add(5);
        sqList.add(8);
        sqList.add(9);
        sqList.add(3);
        sqList.add(7);
        sqList.add(5);
    }
    @Test
    public void testBubbleSort1(){
        addSomeData();
        sqList.print();
        Sort.bubbleSort1(sqList);
        sqList.print();
        System.out.println(sqList.remove(5));
        sqList.print();
    }

    @Test
    public void testBubbleSort2(){
        addSomeData();
        sqList.print();
        Sort.bubbleSort2(sqList);
        sqList.print();
    }

    @Test
    public void testBubbleSort3(){
        addSomeData();
        sqList.print();
        Sort.bubbleSort3(sqList);
        sqList.print();
    }

    @Test
    public void testSelectSort(){
        addSomeData();
        sqList.print();
        Sort.selectSort(sqList);
        sqList.print();
    }

    @Test
    public void testInsertSort(){
        addSomeData();
        sqList.print();
        Sort.insertSort(sqList);
        sqList.print();
    }
}
