package com.liangdi.algorithm.array;

/**
 * @author Liang Di
 * @since 1.0.0
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param array 原始数据
     */
    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                array[i] = array[i] + array[minIndex];
                array[minIndex] = array[i] - array[minIndex];
                array[i] = array[i] - array[minIndex];
            }
        }
    }

}
