import java.util.*;
class Employee2{
    int empId, empSalary;
    String empName;
    String empDesignation, empLocation;

    Employee2(int empId, int empSalary, String empName, String empDesignation, String empLocation ){
        this.empId=empId;
        this.empDesignation=empDesignation;
        this.empLocation=empLocation;
        this.empName=empName;
        this.empSalary=empSalary;


    }
    // getters method
    public String getName() {
        return this.empName;
    }
    public int getSalary() {
        return this.empSalary;
    }
    public String getLocation() {
        return this.empLocation;
    }
    public String getDesg() {
        return this.empDesignation;
    }


    // Setters method
    public void setName(String name) {
        this.empName=name;
    }
    public void setSalary(int sal) {
        this.empSalary=sal;
    }
    public void setLocation(String loc) {
        this.empLocation=loc;
    }
    public void setDesg(String desg) {
        this.empDesignation=desg;
    }

    // toString
    public String toString(){//overriding the toString() method
        return empName+" "+empId+" "+empLocation;
    }

}

public class Employeee {


    public static void main(String[] args) {

        List<Employee2> li = new ArrayList<Employee2>();
        //                          (id, salary, name, designation, location
        Employee2 e1 = new Employee2(1, 70000, "Shubham", "AGM", "Pune" );
        li.add(e1);
        Employee2 e2 = new Employee2(2, 120000, "Yukku", "CEO", "Raipur" );
        li.add(e2);
        Employee2 e3 = new Employee2(3, 25000, "Laksya", "GM", "Chandigarh" );
        li.add(e3);
        Employee2 e4 = new Employee2(4, 90000, "Neeraj", "SA", "Mumbai" );
        li.add(e4);
        Employee2 e5 = new Employee2(5, 1000, "Sanya", "Gardner", "Agra" );
        li.add(e5);
        Employee2 e6 = new Employee2(6, 50000, "Lubna", "ContW", "Delhi" );
        li.add(e6);
        Employee2 e7 = new Employee2(7, 100000, "Arnav", "PM", "Delhi" );
        li.add(e7);
        Employee2 e8 = new Employee2(8, 65000, "Harshit", "WebdE", "Chandigarh" );
        li.add(e8);
        Employee2 e9 = new Employee2(9, 35000, "Nitish", "SD", "Mumbai" );
        li.add(e9);
        Employee2 e10 = new Employee2(10, 20000, "gagan", "Analyst", "Jalandhar" );
        li.add(e10);

        System.out.println("Name of all employee");
        li.stream().forEach(p -> System.out.println(p.getName()));
        System.out.println("Employee greater than 50000");
        li.stream().filter(p -> p.getSalary() > 50000).forEach(p -> System.out.println(p.getSalary()));
        System.out.println("Location Starting with M");
        li.stream().filter(p -> p.getLocation().startsWith("M")).forEach(p -> System.out.println(p.getLocation()));
        System.out.println("Designation Ends with E");
        li.stream().filter(p -> p.getDesg().endsWith("E")).forEach(p -> System.out.println(p.getDesg()));


    }

}
