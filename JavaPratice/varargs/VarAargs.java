package JavaPratice.varargs;

public class VarAargs {

    static int min(int... vals){
        int min=Integer.MAX_VALUE;
        for(int k:vals){
            if(k<min){
                min=k;
            }
        }
        return min;
    }

    static double min(double... vals){
        double min=Integer.MAX_VALUE;
        for(double k:vals){
            if(k<min){
                min=k;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int m=min();
        System.out.println(m);
        int n=min(1,2);
        System.out.println(n);
        int o=min(-1,2,3);
        System.out.println(o);
        double db=min(1.1,2.2);
        System.out.println(db);
    }
}
