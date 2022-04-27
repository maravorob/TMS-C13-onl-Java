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
        Random rd = new Random();

        while(true){
            System.out.println("Введите число элементов массива (от 5 до 10 включительно).");
            int n = sc.nextInt();

            if ((n>5)&&(n<=10)){

                int[] array = new int[n];
                for(int i=0; i<array.length; i++){
                    array[i]=rd.nextInt(21);
                }
                System.out.println("Исходный массив:"+(Arrays.toString(array)));

                int count =0;
                for (int i=0; i<array.length; i++){
                    if (array[i]%2==0){
                        count++;
                    }
                }

                int[] newArray = new int[array.length-count];
                for (int i = 0, j=0; j < array.length; i++,j++) {
                    if (array[i] %2==0) {
                        if (i==array.length-1){
                            break;
                        }
                        newArray[i]=array[j++];  //.ArrayIndexOutOfBoundsException - исправить
                    }
                    newArray[i]=array[j];
                }
                System.out.println("Количество четных элементов в массиве: "+count);
                System.out.println("Новый массив: "+Arrays.toString(newArray));

                break;

            }else{
                System.out.print("Неверное значение. ");
            }
        }
    }
}
