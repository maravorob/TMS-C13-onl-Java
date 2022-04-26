package homework.task04;

//2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        Random random = new Random();
        for(int i=0; i<n; i++){
            array[i]=random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));

    }
}
