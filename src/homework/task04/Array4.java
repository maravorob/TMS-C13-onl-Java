package homework.task04;

//4. Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива пусть задается
// с консоли и размер массива может быть больше 5 и меньше или равно 10.
// Если n не удовлетворяет условию - выведите сообщение об этом. Если пользователь ввёл не подходящее число,
// то программа должна просить пользователя повторить ввод.
// Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Введите число элементов массива (от 5 до 10 включительно).");
            int n = sc.nextInt();

            if ((n>5)&&(n<=10)){
                int[] array=createArray(n);
                System.out.println("Исходный массив:"+(Arrays.toString(array)));
                break;

            }else{
                System.out.print("Неверное значение. ");
            }
        }




    }

    static int[] createArray(int elements){
        Random rd = new Random();
        int array[] = new int[elements];
        for(int i=0; i<array.length; i++){
            array[i]=rd.nextInt(21);
        }
        return array;
    }

}
