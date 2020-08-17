//Question 5
// Print the sum, difference and product of two complex numbers by creating a
//class named
//'Complex' with separate methods for each operation whose real and imaginary
//        parts are entered by user.

import java.util.Scanner;

public class Complex {

    public static void add(int x, int u, int y, int v ) {

        int constant=x+y;
        int imag=u+v;
        System.out.println("Sum is: ("+constant+")"+"+"+"("+imag+")i");

    }
    public static void difference(int x, int u, int y, int v ) {

        int constant=x-y;
        int imag=u-v;
        System.out.println("Difference is: ("+constant+")"+"+"+"("+imag+")i");

    }
    public static void product(int x, int y, int u, int v ) {

        int constant=x*u+y*v;
        int imag=x*v+y*u;
        System.out.println("Product is: ("+constant+")"+"+"+"("+imag+")i");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Complex number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("your complex number is: "+"("+a+")"+"+"+"("+b+")i");
        System.out.println("Enter ssecond Complex number");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("your complex number is: "+"("+c+")"+"+"+"("+d+")i");
        add(a,b,c,d);
        difference(a,b,c,d);
        product(a,b,c,d);
        sc.close();


    }

}
