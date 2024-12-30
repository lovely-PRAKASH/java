package JavaPratice.abstractF;

abstract class Member{
   private String name;

    abstract void greetings();

    public String getName(){
        return name;
    }
}
class Student extends Member{
 
    void greetings(){
        System.out.println("Welcome student...");
    }
}
class Teacher extends Member{

    void greetings(){
        System.out.println("welcome Teacher...");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

        Member[] m1=new Member[4];
        m1[0]=new Student();
        m1[1]= new Student();
        m1[2]=new Teacher();

        for (Member m:m1){
            m.greetings();
        }
        
    }
}
