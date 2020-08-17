//Question 6

// Write a program, creating a class which contains a method that would print
//        the information (name, year of joining, salary, address) of three employees by
//        creating a class named 'Employee'. The output should be as follows:
//        Name Year of joining Address
//        Robert 1994 64C- WallStreet
//        Sam 2000 68D- WallStreet
//        John 1999 26B- WallStreet

public class Employee {

    String Name, Address;
    int yearOfJoining;
    Employee(String name, String add, int yoj){
        this.Name=name;
        this.Address=add;
        this.yearOfJoining=yoj;
    }
    public void information() {
        System.out.println(this.Name+" "+this.yearOfJoining+" "+this.Address);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee one = new Employee("Shubham", "Raipur", 2015);
        Employee two = new Employee("Gagandeep","Jalandhar",2017);
        Employee three = new Employee("Shikshit","Delhi",2019);
        System.out.println("Name Year of joining Address");
        one.information();
        two.information();
        three.information();


    }

}