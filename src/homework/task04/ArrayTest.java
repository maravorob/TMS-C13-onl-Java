package homework.task04;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String [] args){
        String[] items = {"Table", "Chair"};
        for (String item : items){
            System.out.println("Current item is: "+item);
        }
        int[] array = {1,8,5,9};
        Arrays.binarySearch(array,8);
        System.out.println(Arrays.toString(array));
    }
}
