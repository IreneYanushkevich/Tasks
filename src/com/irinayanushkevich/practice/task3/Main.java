package com.irinayanushkevich.practice.task3;

/* Дан класс:
   public class Foo {
   public void first(Runnable r) { print("first"); }
   public void second(Runnable r) { print("second"); }
   public void third(Runnable r) { print("third"); }
}
Один и тот же экземпляр данного класса будет вызван 3мя разными потоками. Поток А - будет вызывать метод first(). Поток B-
second(). Поток С - third(). Необходимо реализовать механизм и изменить программу таким образом, что методы класса Foo
будут вызваны в правильном порядке. Пример: Вывод: "firstsecondthird". Мы не знаем, в каком порядке будут вызваны методы,
но должны гарантировать порядок.  */

public class Main {

    public static void main(String[] args) {

        Foo1 foo = new Foo1();

        new Thread(() -> {
            try {
                foo.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }).start();
    }
}