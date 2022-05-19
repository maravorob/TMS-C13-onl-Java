package homework.task08;

import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    void recieveCall(String name){
        System.out.println("Звонит "+name+". "+getNumber());
    }

    void recieveCall(String name, int number){
        System.out.println("Звонит " + name + "." + " с номера " + number);

    }

    void sendMessage (int ...number){
        for (int i =0; i<number.length; i++){
            System.out.println(Arrays.toString(number));
        }

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
