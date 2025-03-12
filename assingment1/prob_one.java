//Define a class Point with two fields x and y each of type double. Also , define a method 
// distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the 
// value in double. Use Math.sqrt( ) to calculate the square root.  in java




class Point{
    double x,y;
    //constructor
    Point(double x,double y){
        this.x = x; 
        this.y = y;

    }
    static double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }


}
public class prob_one {

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 1);
        System.out.println("Distance: " + Point.distance(p1, p2));


    }
}