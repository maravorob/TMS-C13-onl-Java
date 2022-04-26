package homework.task03;

/* 3. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.*/

import java.util.Scanner;

import static java.lang.System.in;

public class Loop1 {
    public static void main(String[] args){

        System.out.print("Ввеедите любое целое положительное число: ");
        int sum=0;
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        for (int i=1; i<a; i++){
            sum=sum+i;
        }
        System.out.printf("Сумма чисел равна %d",sum);
    }


}
