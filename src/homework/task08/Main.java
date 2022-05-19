package homework.task08;

public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone(2591254, "Asus", 299);
        Phone phone2 = new Phone(5468749, "Apple", 483);;
        Phone phone3 = new Phone (5489635, "Huawei", 580);

        Phone [] phones = {phone1, phone2, phone3};

        for (Phone i : phones){
            i.recieveCall("Misha");
            i.recieveCall("Kolya", 1235489);
        }

        phone1.sendMessage(5489632);
        phone2.sendMessage(5479856);
        phone3.sendMessage(8469528);



    }
}
