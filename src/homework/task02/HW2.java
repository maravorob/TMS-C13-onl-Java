package homework.task02;

import java.util.Scanner;

public class HW2 {
     public static void main (String args[]) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Введите ваше имя.");

                  String name = sc.nextLine();
         System.out.println("Привет, " + name.toString()+"!");

         sc.close();

     }
}

