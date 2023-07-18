public class Rectangle extends Shape{

    private int width;
    private int height;
    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double getPerimeter() {
        return width*2 + height*2;
    }
}
