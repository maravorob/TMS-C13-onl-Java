package homework.task03;

import java.util.Scanner;

public class LoopAddTask2 {
     /*2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
     Напишите программу, в которую пользователь вводит сумму вклада и
    количество месяцев. А банк вычисляет конечную сумму вклада с учетом
    начисления процентов за каждый месяц. Для вычисления суммы с учетом
    процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float summ = sc.nextFloat();
        System.out.print("Введите количество месяцев вклада: ");
        int month = sc.nextInt();
        int percent = 7;
        System.out.println("Ваша процентная ставка составляет: "+percent+"%");
        float profitEnd=0;

        for (int i=1; i<=month; i++){
            float profit=summ*percent*i/100;
            profitEnd=profitEnd+profit;
        }

        System.out.print("Сумма с учетом процентов составит "+profitEnd);



    }


}
