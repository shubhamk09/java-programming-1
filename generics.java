//Question 8
// Write a program, creating a class containing the generic method which
//        accepts only numbers, generating a custom exception when passed with the
//        String value. The functionality of the generic method is to print the 2/3 of the
//        passed value.


import java.util.Scanner;

class MyException extends Exception{
    MyException(String str){
        super(str);

    }
}

public class generics {

    static <T> void twothird(T num) {
        try {
            if(num instanceof Number) {
                double res = Double.parseDouble(num.toString()) * 2/3;
                System.out.println(res);
            }
            else {
                MyException me = new MyException("It is not a number");
                throw me;
            }

        }
        catch(MyException me) {
            System.out.println(me);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        twothird(Double.parseDouble(a));
        sc.close();


    }

}
