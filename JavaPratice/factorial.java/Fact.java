public class Fact {

    static int fact(int num) {
        if (num == 0) {
            return 1;
        }else{
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) {

        int num = 5;
        System.out.println(fact(num));

    }
}