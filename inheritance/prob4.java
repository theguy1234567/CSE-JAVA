//Hierarchical inheritance example

class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name+" is eating");
    }
}
class Dog extends Animal{
    Dog(String name ){
        super(name);
    }
    void Bark(){
        System.out.println(name + " is barking");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);

    }
    void meow(){
        System.out.println(name+": ....meow .....meow");
    }
}


public class prob4 {
    public static void main(String[] args) {
        Cat Terry = new Cat("terry");
        Terry.meow();
        Terry.eat();
        //cant call methods of Dog as class Cat extends Animal
    }
    
}
