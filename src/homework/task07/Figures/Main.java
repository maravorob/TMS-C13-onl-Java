package homework.task07.Figures;

public class Main {
    public static void main(String[] args){
        Triangle triangle = new Triangle(5,6,7);
        Rectangle rectangle = new Rectangle(6,8);
        Circle circle = new Circle(9);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(5);

        triangle.perimetrCalc();
        rectangle.perimetrCalc();
        circle.perimetrCalc();

        triangle.squareCalc();
        rectangle.squareCalc();
        circle.squareCalc();

        Calculatable[] figureArray = {triangle, rectangle, circle, circle2, circle3};
        float sum=0;
        for (Calculatable i : figureArray){
            sum=sum+i.perimetrCalc();
        }
        System.out.println(sum);



    }
}
