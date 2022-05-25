package homework.task09Vector;

import java.util.Random;

public class Vector2d {

    double x;
    double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    String INFO = "Это двухмерный вектор.";

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getLength(){
        double length = Math.sqrt((x*x)+(y*y));
        return length;
    }

    public double getScalar(Vector2d vector2d){
        return x*vector2d.getX()+y*vector2d.getY();
    }

    public Vector2d getSum(Vector2d vector2d){
        return new Vector2d(x+vector2d.getX(), y+vector2d.getY());
    }

    public Vector2d getDiff(Vector2d vector2d){
        return new Vector2d(x+vector2d.getX(), y-vector2d.getY());
    }

    public int compare(Vector2d vector2d){
        return (int) (this.getLength()-vector2d.getLength());
    }

    @Override
    public String toString() {
        return "Vector2d{" +
                "x=" + x +
                ", y=" + y +
                ", INFO='" + INFO + '\'' +
                '}';
    }


    public static Vector2d[] returnsVectors(int n) {
        Random random = new Random();
        Vector2d[] vectorNew = new Vector2d[n];
        for (int i = 0; i < n; i++) {
            vectorNew[i] = new Vector2d(random.nextInt(), random.nextInt());
        }
        return vectorNew;
    }


}
