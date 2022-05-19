package homework.task07.Figures;

public class Triangle extends Figure implements Calculatable {

    float a;
    float b;
    float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float squareCalc() {
        float halfP=(a+b+c)/2;
        float triangleSquare = (float) Math.sqrt(halfP*(halfP-a)
        *(halfP-b)*(halfP-c));
        return triangleSquare;
    }

    @Override
    public float perimetrCalc() {
        float trianglePerimetr=a+b+c;
        return trianglePerimetr;
    }
}
