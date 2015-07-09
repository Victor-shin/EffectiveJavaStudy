package effectiveJava.rule33;

import java.util.*;

/**
 * Created by trknight78 on 2015. 7. 9..
 */
public class Rule33EnumMap {


    public static void main(String[] args) {

        Herb[] garden = {new Herb("halla", Herb.Type.ANNUAL),
                new Herb("seo", Herb.Type.PERENNIAL),
                new Herb("num1", Herb.Type.BIENNIAL),
                new Herb("num2", Herb.Type.BIENNIAL),
                new Herb("num3", Herb.Type.BIENNIAL),
                new Herb("num4", Herb.Type.ANNUAL),
        };

        // EnumMap
        Map<Herb.Type, Set<Herb>> herbsByType =
                new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);

        for (Herb.Type t : Herb.Type.values())
            herbsByType.put(t, new HashSet<Herb>());

        for (Herb h : garden)
            herbsByType.get(h.type).add(h);

        System.out.println(herbsByType);

        
        // HashMap
        Map<Herb.Type, Set<Herb>> herbsByType2 =
                new LinkedHashMap<Herb.Type, Set<Herb>>();

        for (Herb.Type t : Herb.Type.values())
            herbsByType2.put(t, new HashSet<Herb>());

        for (Herb h : garden)
            herbsByType2.get(h.type).add(h);

        System.out.println(herbsByType2);


    }
}
