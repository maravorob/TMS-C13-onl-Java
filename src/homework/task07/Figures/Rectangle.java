package homework.task07.Figures;

public class Rectangle extends Figure  implements Calculatable{
    float a;
    float b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public float squareCalc() {
        float rectangleSquare = a*b;
        return rectangleSquare;
    }

    @Override
    public float perimetrCalc() {
        float rectanglePerimetr=(a+b)*2;
        return rectanglePerimetr;
    }
}
