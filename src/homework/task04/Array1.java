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

        if ((counts(arr, elementToDelete))==0){
            System.out.println("Число не входит в массив.");
            return;
        }else{
            System.out.println("Число вхождений элемента в массив = "+counts(arr, elementToDelete));
            System.out.println("Новый массив: "+Arrays.toString(createNewArr(arr, elementToDelete)));

        }
    }

    static int counts (int[] arr, int key){
        int count=0;
        for (int i: arr){
            if (i==key) {
                count++;
            }
        }
        return count;
    }

    static int findSize (int arr[], int elementToDelete){
        int size = 0;
        for(int i=0; i<arr.length; i++){
            if (elementToDelete==arr[i]){
                continue;
            }else{
                size++;
            }
        }
        return size;
    }

    public static int[] createNewArr(int arr[], int elementToDelete){

        int size = findSize(arr, elementToDelete);

        int[] newArr = new int[size];
        for (int i = 0, j = 0; j < newArr.length; i ++, j ++) {
            if (arr[i] == elementToDelete) {
                newArr[i]=arr[j++];
            } else {
                newArr[ i ] = arr [ j ]; // баг, если вхождения элементов находятся последовательно.
                // например 8, 7, 7, 9, 6 - пр удалении 7 выходит следующий ответ: 8,7,9
            }
        }
        return newArr ;
    }
}


//int[] newArr = null;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == elementToDelete) {
//                newArr = new int[arr.length - 1];
//                for (int index = 0; index < i; index++) {
//                    newArr[index] = arr[index];
//                }
//                for (int j = i; j < arr.length - 1; j++) {
//                    newArr[j] = arr[j + 1];
//                }
//            }
//        }
//        return newArr ;