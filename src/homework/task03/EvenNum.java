package homework.task03;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args){
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        }else{
            System.out.println("Число нечётное");
        }


    }
}
