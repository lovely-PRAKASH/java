interface Ridable {
    public void ride(); 

    default public void display(){
        System.out.println("you are riding");
    }
}
interface Rolles{
    default public void carType(){
        System.out.println("Rolles Royes car");
    }
}
class Car implements Ridable{
    public void ride(){
        System.out.println("Your are Riding a Car");
    }
    public void display(){
        System.out.println("your are riding a car1");
    }
    public void checkCar(){
        System.out.println("calling car using bike");
    }
}

class Bike extends Car implements Rolles{
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
        Bike b1=new Bike();
        Ridable r1= new Ridable() {    
            public void ride(){
                System.out.println("i am riding vintage car");
            }
        };

        c.ride();
        b.ride();
        c.display();
        b.display();
        b1.checkCar();
        b1.carType();
        r1.ride();
    }
}