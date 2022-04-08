package homework.task03;

/* 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
При решении используйте операцию инкремента (++).
2. Необходимо вывести на экран числа от 5 до 1.
При решении используйте операцию декремента (--).*/

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
