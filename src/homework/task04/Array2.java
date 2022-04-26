package homework.task04;

//2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String [] args){
        System.out.println("Введите количество элементов массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];


        for(int i=0; i<n; i++){
            array[i]= (int) (0+Math.random()*21);
        }

        int max = 0;
        for (int i=0; i<n; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        int min = array[0];
        for(int i=0; i<n; i++){
            if (array[i]<min){
                min=array[i];
            }
        }

        int mediumSum=0;
        for(int i=0; i<n; i++){
            mediumSum=mediumSum+array[i];
        }
        int medium = mediumSum/n;

        System.out.println("Массив чисел: "+Arrays.toString(array)+". Максимальное значение: "+max+
                ". Минимальное значение: "+min+". Среднее значение: "+medium+".");
    }
}
