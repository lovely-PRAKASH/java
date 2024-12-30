package JavaPratice.abstractF;

abstract class Shape{
    
    abstract void area();
}
class Square extends Shape{
    private double side;
    
    public Square(double s){
        this.side = s;
    };

    void area(){
        System.out.println("area of square is "+side*side);
    }
}
class Triangle extends Shape{
    private double height;
    private double base;
    Triangle(double h, double b){
        this.height=h;
        this.base=b;
    }
    void area() {
        System.out.println("area of triangle is "+ height*base);
    }
}
public class abstractDemo2 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Square(2);
        shapes[1]=new Triangle(4,2);

        for(Shape s:shapes){
            s.area();
        }
    }
}
