// Question Number One
// Design a Calculator class which contains four lambda
//        methods:
//        a. add(a, b) b.
//        difference(a, b) c.
//        product(a, b) d.
//        safeDivision(a, b)
//        Also design the main methods which pass actual parameters to test the
//        Calculator class


import java.util.Scanner;

public class Calculator{

    interface addition{
        int add(int a, int b);
    }
    interface subtraction{
        int difference(int a, int b);
    }
    interface multiply{
        int product(int a, int b);
    }
    interface division{
        int safeDivision(int a, int b);
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();

        addition ans1 =  (int c, int d) ->{ return c+d;};
        System.out.println(ans1.add(a, b));

        subtraction ans2=(int c, int d) ->{return c-d;};
        System.out.println(ans2.difference(a, b));

        multiply ans3=(int c, int d) ->{return c*d;};
        System.out.println(ans3.product(a, b));

        division ans4=(int c, int d) ->{
            if(b==0) {
                return 0;
            }
            else {
                return a/b;
            }
        };
        System.out.println(ans4.safeDivision(a, b));
        sc.close();


    }



}
