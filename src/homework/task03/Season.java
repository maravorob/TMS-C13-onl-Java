package homework.task03;

import java.util.Scanner;

public class Season {

    public static void main(String args[]){


        while(true) {

        System.out.println("Enter a number of the month (1-12):");
        Scanner sc = new Scanner(System.in);
        int seasonChoice = sc.nextInt();


        if(seasonChoice<=0) {
            System.out.print("Incorrect number. ");
        }else if(seasonChoice>12){
            System.out.print("Incorrect number. ");
        }else {
            switch (seasonChoice) {
                case 1:
                    System.out.println("Winter");
                    break;
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                    System.out.println("Spring");
                    break;
                case 4:
                    System.out.println("Spring");
                    break;
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                    System.out.println("Summer");
                    break;
                case 7:
                    System.out.println("Summer");
                    break;
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                    System.out.println("Autumn");
                    break;
                case 10:
                    System.out.println("Autumn");
                    break;
                case 11:
                    System.out.println("Autumn");
                    break;
                case 12:
                    System.out.println("Winter");
                    break;
            }
            break;
        }





        }

    }

}


