package com.lzlgdx.test.sort;

/**
 * @version java基础.1.0
 * @Description: 线性表
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 10:15
 */
public class SqList {
    static int MAXSIZE=10;
    /** r[0]用作哨兵 */
    int[] capacity=new int[MAXSIZE+1] ;
    int length;

    public SqList(){
        init();
    }

    /**
     * @Description 初始化顺序表，使用数组存储，当没有数据时，同一初始化为65535，无穷
     * @Param  no
     * @return no
     */
    public void init(){
        for (int i=0;i<MAXSIZE+1;i++){
            capacity[i]=Integer.MAX_VALUE;
        }
        //留空一个元素，下标为0的元素要存哨兵，不要动
        this.length=1;
    }

    /**
     * @Description 顺序添加元素
     * @Param  num 要添加的元素的值
     * @return 添加成功返回true，否则返回false
     */
    public boolean add(int element){
        for (int i=1;i<MAXSIZE+1;i++){
            if (capacity[i]==Integer.MAX_VALUE){
                capacity[i]=element;
                length++;
                return true;
            }
        }
        return false;
    }

    /**
     * @Description 根据下标添加元素
     * @Param  num元素，subscript下标
     * @return 添加成功返回true，否则返回false
     */
    public boolean addBySubscript(int element,int subscript){
        if (capacity[subscript]!=Integer.MAX_VALUE){
            return false;
        }
        capacity[subscript]=element;
        length++;
        return true;
    }

    /**
     * @Description 移除给定元素
     * @Param  element 给定元素
     * @return 如果移除成功返回移除的下标，否则返回-1
     */
    public int remove(int element){
        int k=-1;
        for (int i=length;i>=1;i--){
            if (capacity[i]==element){
               k=i;
            }
        }
        if (k!=-1){
            for (int i=k;i<length;i++){
                capacity[i]=capacity[i+1];
            }
            length--;
            return k;
        }
        return -1;
    }
    public void print(){
        for (int i=1;i<length;i++){
            System.out.print(capacity[i]+" ");
        }
        System.out.println();
    }
}
