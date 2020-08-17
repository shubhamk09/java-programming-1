package cipherschools;

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