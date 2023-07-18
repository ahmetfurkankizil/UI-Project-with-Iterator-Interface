public class Square extends Shape{
    private int side;
    private String name;
    public Square(int side){
        this.side = side;
        this.name = "Square";
    }
    public String getName(){
        return this.name;
    }
    @Override
    double getArea() {
        return side*4;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }
}
