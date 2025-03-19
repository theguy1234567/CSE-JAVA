//  Create a classtelephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
// create another class smart telephone and demonstrate polymorphism 
abstract class Telephone{
    abstract void lift();
    abstract void disconnected();

}
class SmartTelephone extends Telephone{
    @Override
    void lift(){
        System.out.println("Smart telephone has lifted the call");
        
    }
    @Override
    void disconnected(){
        System.out.println("Smart telephone has disconnected");
    }
}
public class prob_six {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();
        phone.lift();
        phone.disconnected();
    }
}
