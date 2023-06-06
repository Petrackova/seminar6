package seminar6;

import java.util.*;

public class Task1 {
/**Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
 1.5. Создайте метод, в который передайте заполненный выше массив,
 и с помощью Set вычислите процент уникальных значений в данном массиве,
 и верните его в виде числа с плавающей запятой.
 Для вычисления процента используйте формулу:
 процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.**/

    public void prim1() {
        Random rand = new Random();
        Integer[] arr = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = rand.nextInt(25);
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        set.addAll(list);
        System.out.println(set.size()*100f/arr.length);
    }
}
