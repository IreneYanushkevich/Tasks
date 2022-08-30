package com.irinayanushkevich.practice;

import java.util.Arrays;

class Task1 {

    /* Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых
       в сумме дают число переданное в массив.
       Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
       Один и тот же элемент не может быть использован дважды.
                array = [3, 8, 15, 17], Number = 23
                result = [1,2]
       Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23 */

    public static void main(String[] args) {

        int[] array = {3, 8, 15, 17};
        int num = 23;
        int[] indexes;

        indexes = findIndexes(array, num);

        System.out.println("Numbers with indexes " + Arrays.toString(indexes) + " are given in total " + num);
    }

    public static int[] findIndexes(int[] array, int num) {

        int[] indexes = new int[2];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }
}
