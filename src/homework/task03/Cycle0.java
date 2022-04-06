package homework.task03;

public class Cycle0 {
    public static void main(String[] args) {
        System.out.print("Нечетные числа: ");
        for(int i=1; i<100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

        System.out.print("\nЧисла от 5 до 1: ");
        for(int i=5; i>0; i--){
            System.out.print(i+" ");
        }
    }

}
