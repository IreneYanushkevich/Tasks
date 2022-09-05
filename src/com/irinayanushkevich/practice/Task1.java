package com.irinayanushkevich.practice;

import java.lang.reflect.Array;
import java.util.*;

class Task1 {

    /* Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых
       в сумме дают число переданное в метод.
       Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
       Один и тот же элемент не может быть использован дважды.
                array = [3, 8, 15, 17], Number = 23
                result = [1,2]
       Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23 */

    public static void main(String[] args) {

        int num = 23;
        int[] indexes;

        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(8);
        array.add(15);
        array.add(17);

       /* LinkedHashSet<Integer> array = new LinkedHashSet<>();
        array.add(3);
        array.add(8);
        array.add(15);
        array.add(17);*/

        indexes = findIndexes(array, num);
        System.out.println("Numbers with indexes " + Arrays.toString(indexes) + " are given in total " + num);
    }

    public static int[] findIndexes(ArrayList<Integer> list, int num) {

        int[] indexes = new int[2];

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(num - list.get(i))) {
                indexes[0] = i;
                indexes[1] = list.indexOf(num - list.get(i));
                break;
            }
        }
        return indexes;
    }


  /*  public static int[] findIndexes(LinkedHashSet<Integer> array, int num) {

        ArrayList<Integer> k = new ArrayList<>(array);
        Iterator<Integer> itr = array.iterator();
        ArrayList<Integer> l = new ArrayList<>();
        int[] indexes = new int[2];
        int id = 0;

        while (itr.hasNext()) {
            int temp = itr.next();
            if (array.contains(num - temp)) {
                indexes[0] = id;
                l.add(num - temp);
                indexes[1] = Collections.indexOfSubList(k, l);
                break;
            }
            id++;
        }
        return indexes;
    }*/
}

