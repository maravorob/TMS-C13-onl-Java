package homework.task09Vector;

import java.util.Arrays;

public class Main {

    public static void main (String args[]) {

        Vector2d a = new Vector2d(3,8);
        Vector2d b = new Vector2d(9,6);


        System.out.println(a.getLength());
        System.out.println(b.getLength());

        System.out.println(a.getScalar(b));
        System.out.println(a.getSum(b));
        System.out.println(a.getDiff(b));
        System.out.println(a.compare(b));
        System.out.println(Arrays.toString(Vector2d.returnsVectors(5)));




    }


}
