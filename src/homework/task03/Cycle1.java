package homework.task03;

import java.util.Scanner;

import static java.lang.System.in;

public class Cycle1 {
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
