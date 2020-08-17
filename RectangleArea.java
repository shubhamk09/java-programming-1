
// Question Two
// Create two
//         classes:
//         BaseCla
//         ss
//         The Rectangle class should have two data fields-width and height of int types.
//        The class should have display() method, to print the width and height of the
//        rectangle separated by space.
//        DerivedCla
//        ss
//        The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class
//of Rectangle class.The class should have read_input() method, to read the
//        values of width and height of the rectangle. The class should also overload the
//        display() method to print the area (width*height) of the rectangle.
//        Input
//        Format
//        The first and only line of input contains two space separated integers
//        denoting the width and
//        height of the
//        rectangle.
//        Constrain
//        ts
//        1 <= width, height <=
//        10^3
//        Output
//        Format
//        The output should consist
//        of:
//        Print the width and height of the
//        rectangle.
//        In the second line, print the area of the
//        rectangle.




import java.util.Scanner;

class Rectangle{
    private int height ;
    private int width;
    void display() {
        System.out.println(width+" "+height);
    }
    void input(int a, int b) {
        this.height=b;
        this.width=a;
    }
    int getHeight() {
        return height;
    }
    int getWidth() {
        return width;
    }

}

public class RectangleArea extends Rectangle {

    void read_input() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        input(a, b);
        sc.close();
    }

    void display() {
        super.display();
        System.out.println(super.getHeight() * super.getWidth());

    }

    public static void main(String[] args) {
        RectangleArea r = new RectangleArea();
        r.read_input();
        r.display();
    }
}
	