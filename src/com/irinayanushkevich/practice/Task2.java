package com.irinayanushkevich.practice;

import java.util.Arrays;

class Task2 {

    /* Дан массив целых чисел. Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
       (только факт наличия дубликатов - подсчитывать количество повторений НЕ нужно).
                Пример:
                Array: [4,5,6,6,8]
                Result: true
                Число 6 повторяется 2 раза
                                                Array: [4,5,6,7,8]
                                                Result: false
                                                Дубликатов нет  */

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 6, 8};
        //int[] array = {4, 5, 6, 7, 8};
        boolean result;

        Arrays.sort(array);
        result = findDuplicate(array);

        System.out.println(result);

    }

    public static boolean findDuplicate(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
