package JavaPratice.abstractF;

abstract class Member{
   private String name;

   Member(String n){
    this.name=n;
   }

    abstract void greetings();

    public String getName(){
        return name;
    }
}
class Student extends Member{

    Student(String n){
        super(n);
    }

    void greetings(){
        System.out.println("Welcome student...");
    }
}
class Teacher extends Member{

    Teacher(String n){
        super(n);
    }
    void greetings(){
        System.out.println("welcome Teacher...");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

        Member[] m1=new Member[4];
        m1[0]=new Student("student1");
        m1[1]= new Student("student2");
        m1[2]=new Teacher("teacher1");
        m1[3]=new Teacher("teacher2");

        for (Member m:m1){
            m.greetings();
            System.out.println(m.getName());;
        }
        
    }
}
