package JavaPratice.fabbinocci;

public class Fabnocci {
    static int fab(int num){
        if(num<=1){
            return 1;
        }else{
            return fab(num-1)+fab(num-2);
        }
    }
    public static void main(String[] args) {
        
        int num=5;
        for (int i=0;i<num;i++){
            System.out.print(fab(i));
        }
    }
}
