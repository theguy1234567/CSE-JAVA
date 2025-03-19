//simple multilevel inheritance example
class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void Eat(){
        System.out.println(name+" is eating!");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void Bark(){
        System.out.println(name+" is barking!");
    }
}
class BabyDog extends Dog{
    BabyDog(String name){
        super(name);
    }
    void weep(){
        System.out.println(name+" is weeping!");
    }
}


public class prob3 {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog("ruffy");
        obj.weep();
        obj.Bark();
        obj.Eat();
    }
}
