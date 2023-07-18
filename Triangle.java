public class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    private String name;
    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = "Triangle";
    }

    public String getName(){
        return this.name;
    }
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
