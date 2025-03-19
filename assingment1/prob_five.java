// Create a class with a method that prints "Thisis parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call ●method of parent class by object of parent class ● method of child class by object of child class ● method of parent class by object of child class 


class Parent{
    void printParent(){
        System.out.println("this is parent class");
    }
}
class Child extends Parent{
    void printChild(){
        System.out.println("this is child class");
    }
}

public class prob_five {
    public static void main(String[] args) {
        Parent p_obj = new Parent();
        Child c_obj = new Child();
        p_obj.printParent();//method of parent class by object of parent class
        c_obj.printChild();//method of child class by object of child class 
        c_obj.printParent();// method of parent class by object of child class 
    }

    
}
