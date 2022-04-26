package homework.task04;

// 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1 {
    public static void main(String [] args) {
        int arr[] = new int[10];

        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));


        System.out.print("Введите число от 0 до 100: ");
        Scanner sc = new Scanner(System.in);
        int elementToDelete = sc.nextInt();

        if ((contains(arr, elementToDelete))==true){
            System.out.println("Новый массив: "+Arrays.toString(createNewArr(arr, elementToDelete)));
        }else{
            System.out.println("Число не входит в массив.");
        }
    }

    static boolean contains(int[] arr, int key){
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int[] createNewArr(int arr[], int elementToDelete){
        int[] newArr = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == elementToDelete) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
            }
        }
        return newArr ;
    }
}
