package com.liangdi.algorithm.array;

/**
 * @author Liang Di
 * @since 1.0.0
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array 原始数据
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
    }

}
