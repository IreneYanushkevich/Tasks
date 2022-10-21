package com.irinayanushkevich.practice.task2;

import java.util.TreeSet;

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
        // int[] array = {4, 5, 6, 7, 8};
        System.out.println(findDuplicate(array));
    }

    public static boolean findDuplicate(int[] array) {

        TreeSet<Integer> s = new TreeSet<>();
        boolean result = false;

        for (int element : array) {
            if (!s.add(element)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
