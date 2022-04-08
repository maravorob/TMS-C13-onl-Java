package homework.task03;

public class Cycle2 {
    public static void main(String args[]){
        /*4. Необходимо, чтоб программа выводила на экран вот такую
        последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        В решении используйте цикл while.*/
        int i=7;
        while(i < 100){
            System.out.print(i + " ");
            i=i+7;
        }
        System.out.println();

        /*5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..*/
       int count = 0;
        for (int j=0; j<11; j++){
            count=count-5;
            System.out.print(count + " ");
        }
        System.out.println();

        /*6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.*/
        for (int k=10; k<21; k++){
            System.out.print(k*k+" ");
        }




    }
}
