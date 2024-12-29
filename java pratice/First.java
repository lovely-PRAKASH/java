// create a class called student. add relevent data like name, roll no, marks in an array. 
// define marksTotal method create diffrent students object, assign values and invoke method in java.

public class First{
    public static void main(String[] args) {
        System.out.println("heelo");

        Student student1=new Student();
        student1.name="prakash";
        student1.rollNo=1;
        student1.marks=new int[] {90,90,90};
        student1.displayDetials();
    }
}

class Student{
    String name;
    int rollNo;
    int[] marks;

    public int totalMarks(){
        int total=0;
        for(int mark:marks){
            total+=mark;
        }
        return total;
    }
    public void displayDetials(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(totalMarks());

    }
}