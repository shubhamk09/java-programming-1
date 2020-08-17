
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
	