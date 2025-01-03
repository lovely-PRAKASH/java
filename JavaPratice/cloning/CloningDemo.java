package JavaPratice.cloning;

class Department{
    int id;
    String depName;
    Department(int id, String dName){
        this.id=id;
        this.depName=dName;
    }
    public void display(){
        System.out.println("deptId "+id);
        System.out.println("DeptName "+depName);
    }
}
class Student{
    int id;
    String name;
    Department dept;

    Student(int id, String name, Department dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.dept=s.dept;
    }
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        // System.out.println("dep: "+dep);
        dept.display();
    }

}

public class CloningDemo {
    public static void main(String[] args) {
        Department dept=new Department(1, "physics");
        Student s1=new Student(1,"prakash", dept);
        Student s2=new Student(s1);
        s1.display();
        s2.display();
    }
}
