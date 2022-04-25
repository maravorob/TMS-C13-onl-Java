package homework.task05;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args){
        int manChoice = manChoice();
        int computerChoice = computerChoice();
        System.out.printf("Твой выбор = %d, выбор компьютера = %d.\n",manChoice,computerChoice);
        result(manChoice, computerChoice);
    }

    static int computerChoice(){
        int computerChoice = (int) ((Math.random()*3)+1);
        return computerChoice;
    }

    static int manChoice(){
        System.out.println("Приветствую. Введи число: 1. Камень, 2. Ножницы, 3. Бумага");
        Scanner scanner = new Scanner(System.in);
        int manChoice = scanner.nextInt();
        scanner.close();
        return manChoice;
    }

    static void result(int manChoice, int computerChoice){
        if (manChoice==computerChoice){
            System.out.println("Ничья!");
        }else if(((manChoice==1)&&(computerChoice==2))||((manChoice==2)&&(computerChoice==3))||((manChoice==3)&&(computerChoice==1))){
            System.out.println("Ты выиграл!");
        }else{
            System.out.println("Победил компьютер!");
        }
    }

    static int Choice(int choice){ // исправить, чтобы выводилось в консоль не цифра, а название Камень, Ножницы или Бумага.
        switch (choice){
            case 1:
                System.out.println("Камень");
                break;
            case 2:
                System.out.println("Ножницы");
                break;
            case 3:
                System.out.println("Бумага");
                break;
        }
        return choice;
    }

}

