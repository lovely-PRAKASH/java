package JavaPratice.abstractF;

abstract class Shape{
    abstract void area();

}
class Square extends Shape{
    void area(){
        System.out.println("area of square");
    }
}
class Triangle extends Shape{
    
    void area() {
        // TODO Auto-generated method stub
        System.out.println("area of triangle");
    }
}
public class abstractDemo2 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Square();
        shapes[1]=new Triangle();

        for(Shape s:shapes){
            s.area();
        }
    }
}
