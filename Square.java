public class Square extends Shape{
    private int side;
    @Override
    double getArea() {
        return side*4;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }
}
