// 3. Create a class named 'Member' having the following members: 
// Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary' 
// which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
// The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
//  Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same. 


class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}
class Employee extends Member {
    String specialization;
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary); // Call superclass constructor
        this.specialization = specialization;
    }
    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}
class Manager extends Member {
    String department; 
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary); // Call superclass constructor
        this.department = department;
    }
     void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}
public class prob_three {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, "9876543210", "123 Street, City", 50000, "Software Engineer");
        Manager mgr = new Manager("Jane Smith", 40, "8765432109", "456 Avenue, City", 80000, "IT Department");
        System.out.println("Employee Details:");
        emp.printDetails();
        System.out.println();
        System.out.println("Manager Details:");
        mgr.printDetails();
    }
}

