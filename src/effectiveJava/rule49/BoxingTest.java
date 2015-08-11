package effectiveJava.rule49;

/**
 * Created by trknight78 on 2015. 7. 24..
 */
public class BoxingTest {

    public static void main(String args[]) {

        System.out.println(check(new Integer(1), new Integer(1)));
        System.out.println(check(1, new Integer(1)));
        System.out.println((new Integer(1).equals(1)));

        long timestamp = System.currentTimeMillis();
        Long sum = 0L;
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - timestamp));


        timestamp = System.currentTimeMillis();
        long sum2 = 0L;
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - timestamp));
    }

    public static boolean check(Integer a, Integer b) {
        return a.equals(b);
    }
}
