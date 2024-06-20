package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //printEvents(new int[]{2, 1, 2, 3, 4});
        //printEvents(new int[]{2, 2, 0});
        //printEvents(new int[]{1, 3, 5});

        //diffMinMax(new int[]{4,8,9,10,20,98});
        //diffMinMax(new int[]{});

        int[] array1 = {1, 2, 0, 0, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {0, 1, 0, 2, 0};

        System.out.println("array1: " + hasZeroNeighbor(array1));
        System.out.println("array2: " + hasZeroNeighbor(array2));
        System.out.println("array3: " + hasZeroNeighbor(array3));

    }


    // Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static void printEvents(int[] nums) {
        int count = 0;
        List<Integer> evenElements = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evenElements.add(num);
                count++;
            }
        }

        System.out.println("Массив: " + Arrays.toString(nums) + ", Четные элементы: " + evenElements + ", Количество четных элементов:" + count);
    }


    //Написать функцию, возвращающую разницу между самым большим
    //и самым маленьким элементами переданного не пустого массива.

    public static void diffMinMax (int[]array) {
        if (array.length == 0) {
            System.out.println("Массив пуст!");
            return;
        }
        int max = array[0];
        int min = array[0];
        // Находим минимальный и максимальный элементы в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int result = max-min;
        System.out.println("Разница между максимальным и минимальным элементом массива:" + result);
    }

    //Написать функцию, возвращающую истину,
    //если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static boolean hasZeroNeighbor(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            // Проверяем пары соседних элементов
            if(array[i]==0 && array[i+1]==0){
                return true;
            }
        }
        return false;
    }
}
