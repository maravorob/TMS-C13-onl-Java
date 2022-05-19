package homework.task06.OOP;

/*Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/

public class CreditCard {

    String cardNumber;
    int currentSum;

    public static void main(String[] args){

        int addSum=25000;
        int minusSum=16000;

        CreditCard card1 = new CreditCard("1234567891011123", 50000);
        CreditCard card2 = new CreditCard("1234567895246912", 60250);
        CreditCard card3 = new CreditCard("8546921579563214", 8562);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();

        System.out.println("Card 1 plus sum "+addSum+" = "+card1.addMoney(addSum));
        System.out.println("Card 2 plus sum "+addSum+" = "+card2.addMoney(addSum));

        if (card3.currentSum<minusSum){
            System.out.println("Card 3 - Not enough money");
        }else{
            System.out.println("Card 3 minus sum "+minusSum+" = "+card3.minusMoney(minusSum));
        }
    }

    public CreditCard(String cardNumber, int currentSum) {
        this.cardNumber = cardNumber;
        this.currentSum = currentSum;
    }

    int addMoney(int addSum){
        currentSum=currentSum+addSum;
        return currentSum;
    }

    int minusMoney(int minusSum){
        currentSum=currentSum-minusSum;
        return currentSum;
    }

    void cardInfo(){
        System.out.println("Card Number "+cardNumber+". Cash: "+currentSum+".");
        }



}


