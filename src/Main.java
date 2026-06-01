import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3, 4);
        rectangles[1] = new Rectangle(5, 2);
        rectangles[2] = new Rectangle(4.5, 3.5);

        System.out.println(rectangles[0]);
        System.out.println(rectangles[1]);
        System.out.println(rectangles[2]);
        double  maxArea = rectangles[0].area();

        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i].getArea() > maxArea) {
                maxArea = rectangles[i].area();
            }
        }

        int count = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].getArea() == maxArea) {
                System.out.println("Largest area: " + rectangles[i]);
                count++;
            }
        }
        if(count > 1) {
            System.out.println("Number of Rectangle have max Area is: " + count);
        }
    }

}