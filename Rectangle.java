public class Rectangle extends Shape{

    private int width;
    private int height;
    private final String name;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        this.name = "Rectangle";
    }
    public String getName(){
        return this.name;
    }
    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double getPerimeter() {
        return width*2 + height*2;
    }
}
