//simple single inheritance example
class Animal {
    String name;
    Animal( String name){
        this.name = name;
    }
    String Eat(){
        return name+"is eating";
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    String Barking(){
        return "Dog is barking";
    }
}




public class prob2 {
    public static void main(String[] args) {
        Dog obj = new Dog("Ruffy");
        String res = obj.Eat();
        String result = obj.Barking();
        System.out.println(res);
        System.out.println(result);
    }
    
}
