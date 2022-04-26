package homework.task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

public class Array0 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Введите любое целое число от 0 до 100: ");
        int elementToSearch = sc.nextInt();

        int n = 10;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=rd.nextInt(101);
        }
        System.out.print("Исходный массив:");
        System.out.println(Arrays.toString(arr));



        if (contains(arr, elementToSearch)==true){
            System.out.println("Число "+elementToSearch+" входит в массив");
        }else {
            System.out.println("Число не входит в массив.");
        }
    }
    static boolean contains(int[] array, int key){
            for (int i : array) {
                if (i == key) {
                    return true;
                }
            }
            return false;
        }
}
