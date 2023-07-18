public class Circle extends Shape{

    private int radius;
    private final String name;

    public Circle(int radius){
        this.radius = radius;
        this.name = "Circle";
    }
    public String getName(){
        return this.name;
    }
    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
