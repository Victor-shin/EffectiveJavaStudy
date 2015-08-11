package effectiveJava.rule41Overloading;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by trknight78 on 2015. 7. 21..
 */
public class CollectionClassifier {
    public String classify(Set<?> s) {
        return "Set";
    }

    public String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    public static String classify2(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";


    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c) + " / " + classify2(c));
        }
    }


}
