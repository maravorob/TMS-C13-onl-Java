package homework.task09;

public class Vector {
    private int a;
    private int b;
    private int c;

    public Vector (int a, int b, int c) {
        this.a = a;
        this.b=b;
        this.c = c;
    }

    public Vector(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
