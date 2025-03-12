// A class Shape is defined with two overloading constructors in it. Another class Test1 is partially 
// defined which inherits the class Shape. The class Test1 should include two overloading 
// constructors as appropriate for some object instantiation. You should define the constructors 
// using the super class constructors. Also, override the method calculate() in Test1 to calculate the 
// volume of a Shape. 
class Shape{
    double len;
    double height;
    double weidth;
    Shape(){
        this.len = 1;
        this.weidth = 1;
        this.height = 1;
    }
    Shape(double len,double weidth,double height){
        this.height = height;
        this.weidth  = weidth;
        this.len = len;
    }
    double calculate(){
        return 0;
    }
}
class Test1 extends Shape{
    Test1(){
        super();
    }
    Test1(double len,double weidth,double height){
        super(height,weidth,len);
    }
    double calculate(){
        return len*height*weidth;
    }
    public static void main(String[] args) {
        Test1 obj1 = new Test1();  // Calls default constructor
        Test1 obj2 = new Test1(3, 4, 5); // Calls parameterized constructor

        System.out.println("Volume (default values): " + obj1.calculate()); 
        System.out.println("Volume (3x4x5): " + obj2.calculate()); 
    }

}


