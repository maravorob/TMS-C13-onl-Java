package homework.task04;

//3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
// это значение оказалось больше (либо сообщите, что их средние арифметические равны).

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args){
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Массив 1: "+Arrays.toString(randomArray(array1)));
        System.out.println("Массив 2: "+Arrays.toString(randomArray(array2)));


        if (mediumArray(array1)==mediumArray(array2)){
            System.out.printf("Средние значения массивов равны. Среднее значение массива 1 = %.2f, массива 2 = %.2f.",
                    (mediumArray(array1)), (mediumArray(array2)));
        }else if(mediumArray(array1)>mediumArray(array2)){
            System.out.printf("Среднее арифметическое массива 1 больше. %.2f > %.2f.", (mediumArray(array1)), (mediumArray(array2)));
        }else System.out.printf("Среднее арифметическое массива 2 больше. %.2f < %.2f.", (mediumArray(array1)), (mediumArray(array2)));
    }

    public static int[] randomArray(int[] array){
        for(int i=0; i<array.length; i++){
            array[i]=(int) (0+Math.random()*11);
        }
        return array;
    }

    public static float mediumArray(int [] array){
        float sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        float mediumArray = sum/array.length;
        return mediumArray;
    }


}


