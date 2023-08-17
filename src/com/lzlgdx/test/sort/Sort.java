package com.lzlgdx.test.sort;;

/**
 * @version java基础.1.0
 * @Description: 各种排序方法的集合
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 10:28
 */
public class Sort {

    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    /**
     * @Description 对顺序表的L作交换排序，不满足相邻两两互相比较
     * @Param  sqList 顺序表对象
     * @return 不返回值
     */
    public static void bubbleSort1(SqList sqList){
        for (int i=1;i<sqList.length;i++){
            for (int j=i+1;j<sqList.length;j++){
                if (sqList.capacity[i]>sqList.capacity[j]){
                    swap(sqList.capacity,i,j);
                    //记得不能传入新的数组，需要传入原来的数组
                    /*swap(new int[]{sqList.capacity[i],sqList.capacity[j]});*/
                }
            }
        }
        // 5,4,3,2,1  4,5,3,2,1  3,5,4,2,1  2,5,4,3,1  1,5,4,3,2
        //每一轮排序都将最小的数字放在最前面
    }

    /**
     * @Description 标准的冒泡排序，相邻元素比较，每一轮循环将最大一个数字排在最后面
     * @Param  sqList 传入的顺序表
     * @return no
     */
    public static void bubbleSort2(SqList sqList){
        for (int i=1;i<sqList.length;i++){
            for (int j=1;j<sqList.length-i;j++){
                if (sqList.capacity[j]>sqList.capacity[j+1]){
                    swap(sqList.capacity,j,j+1);
                }
            }
        }
    }

    /**
     * @Description 对冒泡排序的优化
     * @Param  sqList顺序表
     * @return no
     */
    public static void bubbleSort3(SqList sqList){
        for (int i=1;i<sqList.length;i++){
            boolean flag=false;
            for (int j=1;j<sqList.length-i;j++){
                if (sqList.capacity[j]>sqList.capacity[j+1]){
                    swap(sqList.capacity,j,j+1);
                    flag=true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    /**
     * @Description 选择排序，假定最小值的为下标为i，逐步比较，使得每轮内循环结束后，都把最小的数排在前面
     * @Param  sqList 线性表
     * @return no
     */
    public static void selectSort(SqList sqList){
        for (int i=1;i<sqList.length;i++){
            int min=i;
            for (int j=i+1;j< sqList.length;j++){
                if (sqList.capacity[min]>sqList.capacity[j]){
                    min=j;
                }
                if (min!=i){
                    swap(sqList.capacity,i,min);
                }
            }
        }
    }
    /**
     * @Description 直接插入排序，时间复杂度n平方
     * @Param  sqList 线性表
     * @return no
     */
    public static void insertSort(SqList sqList){
        int i,j;
        for (i=2;i<sqList.length;i++){
            //5 3 2
            //3 5 2 i=3 3 - 5  - 3 5 235
            if (sqList.capacity[i]<sqList.capacity[i-1]){
                //设置哨兵
                sqList.capacity[0]= sqList.capacity[i];
                for (j=i-1;sqList.capacity[j]>sqList.capacity[0];j--){
                    sqList.capacity[j+1]=sqList.capacity[j];
                }
                sqList.capacity[j+1]=sqList.capacity[0];
            }
        }
    }

}
