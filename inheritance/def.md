<h1>inheritance</h1>
<p>Inheritance is one of the core concepts of Object-Oriented Programming (OOP) that allows one class (child/subclass) to inherit the properties (fields and methods) of another class (parent/superclass). This promotes code reusability, scalability, and better organization.</p>
<h2>Types of inheritance</h2>
<p>   Single Inheritance – One class inherits from another.</p>
class Parent {
    void show() { System.out.println("Parent class method"); }
}
class Child extends Parent {
    void display() { System.out.println("Child class method"); }
}

