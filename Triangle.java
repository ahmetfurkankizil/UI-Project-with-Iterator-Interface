public class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    @Override
    double getArea() {
        double semiPerimeter = getPerimeter()/2;
        return Math.sqrt((semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC)*semiPerimeter);
    }

    @Override
    double getPerimeter() {
        return sideA+sideB+sideC;
    }
}
