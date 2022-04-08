package homework.task04;

import java.util.Random;
import java.util.Scanner;

public class Array0 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Введите любое целое число: ");
        int elementToSearch = sc.nextInt();

        int n = 10;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=rd.nextInt();
            System.out.println(arr[i]);
        }

        for(int i=0; i<n; i++){
            if (arr[i]==elementToSearch){
                System.out.println(elementToSearch+" is found. The element №"+(i+1));
                break;
            }
            // !!! дописать  если число не найдено

        }


    }
}
