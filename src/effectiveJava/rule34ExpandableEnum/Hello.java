package effectiveJava.rule34ExpandableEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by trknight78 on 2015. 7. 10..
 */
public class Hello {

    public static void main(String[] args) {
//        double x = Double.parseDouble(args[0]);
//        double y = Double.parseDouble(args[1]);

        double x = 10;
        double y = 2;

        System.out.println("- Operation list");
        for(ExpandedOperation eo : ExpandedOperation.values()) {
            System.out.println(eo);
        }

        System.out.println("- Bounded type token");
        test(BasicOperation.class, x, y);
        test(ExpandedOperation.class, x, y);


        List operationList = new ArrayList();
        operationList.addAll(Arrays.asList(BasicOperation.values()));
        operationList.addAll(Arrays.asList(ExpandedOperation.values()));

        System.out.println("- Bounded wildcard type");
        test(operationList, x, y);

    }

    private static <T extends Enum<T> & Operation> void test
            (Class<T> opSet, double x, double y) {

        for (Operation op : opSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));

    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
