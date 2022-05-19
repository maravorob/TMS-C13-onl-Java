package homework.task07.Figures;

public class Circle extends Figure implements Calculatable{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }


    @Override
    public float squareCalc() {
        float circleSquare= (float)Math.PI*(radius*radius);
        return circleSquare;
    }

    @Override
    public float perimetrCalc() {
        float squarePerimetr = (float)Math.PI*2*radius;
        return squarePerimetr;
    }
}
