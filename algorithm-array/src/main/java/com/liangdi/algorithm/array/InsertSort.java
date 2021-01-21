package com.liangdi.algorithm.array;

/**
 * @author Liang Di
 * @since 1.0.0
 */
public class InsertSort {

    /**
     * 插入排序
     * 时间复杂度
     * 最优：O(n)
     * 最差：O(n^2)
     * 平均：O(n^2)
     * 空间复杂度：O(1)
     *
     * @param array 原始数据
     */
    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int tempIndex = i;
            while(tempIndex - 1 >= 0 && array[tempIndex - 1] > temp){
                array[tempIndex] = array[tempIndex - 1];
                tempIndex--;
            }
            if (temp != array[tempIndex]){
                array[tempIndex] = temp;
            }
        }
    }

}
