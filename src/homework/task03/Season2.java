package homework.task03;

import java.util.Scanner;

/*2. Написать программу для вывода названия поры года по номеру месяца.
При решении используйте оператор if-else-if.*/

public class Season2 {

    public static void main(String[] args){

        System.out.println("Enter a number of the month (1-12):");
        Scanner sc = new Scanner(System.in);
        int seasonChoice = sc.nextInt();

        if (seasonChoice == (12 | 1 | 2)) {
            System.out.println("Winter");
        } else if (seasonChoice == (3 | 4 | 5)) {
            System.out.println("Spring");
        }else if(seasonChoice==(6|7|8)) { // выбивает некорректный месяц
            System.out.println("Summer");
        }
        else if (seasonChoice == (9 | 10 | 11)) {
            System.out.println("Autumn");
        }else{
            System.out.println("Incorrect number.");
        }


    }
}


