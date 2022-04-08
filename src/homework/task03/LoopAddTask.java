package homework.task03;

public class LoopAddTask {
    public static void main(String args[]){
     /*1. Выведите на экран первые 11 членов последовательности Фибоначчи.*/
     int a=1, b=1, c;
     System.out.print("Числа Фибоначчи: "+a+" "+b+" ");
     for (int i=1; i<=11; i++){
         c=a+b;
         a=b; b=c;
         System.out.print(c+" ");
        }
    System.out.println("\nТаблица умножения 10 на 10:");


     //  3. Напишите программу, которая выводит на консоль таблицу умножения.
     for(int x=1; x<=10;x++){
         for(int y=1; y<=10; y++){
             System.out.print (x*y+" ");
         }
        System.out.println();
     }
    }
}
