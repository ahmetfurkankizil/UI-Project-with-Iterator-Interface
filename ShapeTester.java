import java.util.Scanner;

public class ShapeTester {
    private static ShapeContainer shapeContainer;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection;
        do {
            System.out.println("1. Create a ShapeContainer");
            System.out.println("2. Add a Shape");
            System.out.println("3. Print the values");
            selection = scan.nextInt();
            if(selection == 1){
                System.out.println("What is the name of ShapeContainer?: ");
                String name = scan.next();
                shapeContainer = new ShapeContainer(name);
            }
            else if(selection == 2){
                if (shapeContainer == null) {
                    System.out.println("Please create a ShapeContainer before adding a Shape!");
                }
                else {
                    int selectionShape;
                    do {
                        System.out.println("1. Circle");
                        System.out.println("2. Rectangle");
                        System.out.println("3. Triangle");
                        System.out.println("4. Square");
                        System.out.println("5. Exit");
                        System.out.println("Select a Shape: ");
                        selectionShape = scan.nextInt();
                        if (selectionShape == 1) {
                            System.out.println("The radius of the circle: ");
                            int radius = scan.nextInt();
                            shapeContainer.add(new Circle(radius));
                            System.out.println("Circle is added.");
                        } else if (selectionShape == 2) {
                            System.out.println("The width of the rectangle: ");
                            int width = scan.nextInt();
                            System.out.println("The height of the rectangle: ");
                            int height = scan.nextInt();
                            shapeContainer.add(new Rectangle(width, height));
                            System.out.println("Rectangle is added.");
                        } else if (selectionShape == 3) {
                            System.out.println("Side A of the Triangle: ");
                            int sideA = scan.nextInt();
                            System.out.println("Side B of the Triangle: ");
                            int sideB = scan.nextInt();
                            System.out.println("Side C of the Triangle: ");
                            int sideC = scan.nextInt();
                            shapeContainer.add(new Triangle(sideA, sideB, sideC));
                            System.out.println("Triangle is added.");
                        } else if (selectionShape == 4) {
                            System.out.println("The side of the square: ");
                            int side = scan.nextInt();
                            shapeContainer.add(new Square(side));
                        } else if (selectionShape == 5) {
                            break;
                        }
                    }
                    while (selectionShape <5 && selectionShape >0);
                        System.out.println("Wrong selection!");
                }
            }
            else if (selection == 3) {
                System.out.println(shapeContainer.toString());
            }
        }
        while (selection == 1 || selection == 2);
    }
}
