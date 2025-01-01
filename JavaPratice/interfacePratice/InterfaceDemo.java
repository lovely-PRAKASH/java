interface Ridable {
    public void ride(); 

    default public void display(){
        System.out.println("you are riding");
    }
}
class Car implements Ridable{
    public void ride(){
        System.out.println("Your are Riding a Car");
    }
    public void display(){
        System.out.println("your are riding a car1");
    }
}
class Bike implements Ridable{
    public void ride(){
        System.out.println("Your are Riding a Bike");
    }
    public void display(){
        System.out.println("your are riding a bike1");
    }
}
public class InterfaceDemo{

    public static void main(String[] args) {
        Ridable c=new Car();
        Ridable b= new Bike();

        c.ride();
        b.ride();

    }
}