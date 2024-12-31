// import java.util.logging.Level;
// import java.lang.enum;
package JavaPratice.enumPratice;

enum Level{
    BIGENNER("B"), INTERMIDEATE("I"), ADVANCED("A");
    private String abbr;
    Level(String ab){
        this.abbr=ab;
    }

    public String getAbbrivation(){
        return abbr;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Level l1= Level.ADVANCED;

        System.out.println(l1);
        System.out.println(l1.ordinal());
        System.out.println(l1.getAbbrivation());
        System.out.println(Level.valueOf("ADVANCED"));

    }
}
