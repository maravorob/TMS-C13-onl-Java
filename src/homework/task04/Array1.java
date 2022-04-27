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
            arr[i] = rd.nextInt(11);
        }
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));


        System.out.print("Введите число от 0 до 10: ");
        Scanner sc = new Scanner(System.in);
        int elementToDelete = sc.nextInt();

        int count=0;
        int size = 0;
        for (int i: arr){
            if (i==elementToDelete) {
                count++;
            }else{
                size++;
            }
        }

        if (count==0){
            System.out.println("Число не входит в массив.");

        }else{
            System.out.println("Число вхождений элемента в массив: "+count);

            int[] newArr = new int[size];
            for (int i = 0, j=0; j < arr.length; i++,j++) {
                if (arr[j] == elementToDelete) {
                    if (j==arr.length-1){
                        break;
                    }
                    newArr[i]=arr[j++];
                }
                newArr[i]=arr[j];
            }
            System.out.println("Новый массив: "+Arrays.toString(newArr));
        }
    }

}

//int[] newArr = new int[size];
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] == elementToDelete) {
//                    newArr = new int[arr.length - 1];
//                    for (int index = 0; index < i; index++) {
//                        newArr[index] = arr[index];
//                    }
//                    for (int j = i; j < arr.length - 1; j++) {
//                        newArr[j] = arr[j + 1];
//                    }
//                }
//            }