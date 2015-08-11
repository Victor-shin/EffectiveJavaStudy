package fun;

/**
 * Created by trknight78 on 2015. 7. 10..
 */
public class HelloJava {

    private static String[] getCodes = {
            "A",
            "B",
            "C",
            "D",
    };

    private static String[] getCodes() {
        System.out.println("[!] getCodes() called");
        return getCodes;
    }

    public static void main(String[] args) {
        for(String str : getCodes()) {
            System.out.println("str = " + str);
        }
    }
}
