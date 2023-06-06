import seminar6.*;

import java.time.LocalDate;
import java.util.*;

public class main {
    public static void main(String[] args) {
  /*      *//**Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         *  Распечатайте содержимое данного множества.**//*
        Set<Integer> set = new HashSet<>();
        set.add(10000000);
        set.add(2);
        set.add(365745844);
        set.add(2);
        set.add(4);
        set.add(535673657);
        set.add(6);
        set.add(32346557);
        set.add(0);
        System.out.println(set);

        *//**Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         *  Распечатайте содержимое данного множества.**//*
        LinkedHashSet<Integer> set_1 = new LinkedHashSet<>();
        set_1.add(1);
        set_1.add(2);
        set_1.add(3);
        set_1.add(2);
        set_1.add(4);
        set_1.add(5);
        set_1.add(6);
        set_1.add(3);
        System.out.println(set_1);

        *//**Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         *  Распечатайте содержимое данного множества.**//*
        TreeSet<Integer> set_2 = new TreeSet<>();
        set_2.add(1);
        set_2.add(2);
        set_2.add(3);
        set_2.add(2);
        set_2.add(4);
        set_2.add(5);
        set_2.add(6);
        set_2.add(3);
        set_2.add(0);
        System.out.println(set_2);*/

/*        Task1 task1 = new Task1();
        task1.prim1();*/

        Cat cat = new Cat("Барсик", Gender.MALE, 15.4f, Breed.SIAMS, new ArrayList<>(), new Owner(), LocalDate.now());
        Cat cat_1 = new Cat("Барсик", Gender.MALE, 15.4f, Breed.SIAMS, new ArrayList<>(), new Owner(), LocalDate.now());
        Cat cat_2 = new Cat("Муля", Gender.FEMALE, 3.2f, Breed.RUSSIANBLUE, new ArrayList<>(), new Owner(), LocalDate.of(2007,10,27));
/*
        System.out.println(cat);
        System.out.println(cat_1);
        System.out.println(cat_2);*/

        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat_1);
        cats.add(cat_2);
        System.out.println(cats);
    }
}
