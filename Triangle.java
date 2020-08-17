//Question 7

//Write a program, creating a Triangle class which contains a method that takes
//        three parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns you with
//        the area of the triangle and print it.


import java.util.Scanner;

public class Triangle {
    public static double area(int a, int b, int c) {
        double p =(a+b+c)/2;
        double areat=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return areat;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(area(a,b,c));
        sc.close();
    }

}