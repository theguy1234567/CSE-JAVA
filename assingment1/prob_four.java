//  Create a class named 'Shape' with a method to print "This is This is shape". Then create two 
// other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to 
// print "ThisI rectangularshape" and "This is circular shape" respectively. Create a subclass 
// 'Square' of 'Rectangle having a method to print "Square is a rectangle". Now call the method of 
// 'Shape' and 'Rectangle' clas by the object of 'Square' class. 

class Shape{
    String shape;

    Shape(String shape){
        this.shape = shape;
    }
    void printShape(){
        System.out.println("this is "+this.shape+" shape");
    }
}
class Rectangle extends Shape{
    Rectangle(String shape){
        super(shape);
    }
    

}
class Circle extends Shape{
    Circle (String shape){
        super(shape);
    }
}
class Square extends Rectangle{
    Square(String shape){
        super(shape);
    }
    void printSqaure(){
        System.out.println(this.shape +" is a rectangle");
    }
}

public class prob_four {
    public static void main(String[] args) {
        Square obj = new Square("circle");
        obj.printShape();
        obj.printSqaure();
    }
}
