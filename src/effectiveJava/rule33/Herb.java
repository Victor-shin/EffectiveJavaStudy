package effectiveJava.rule33;

/**
 * Created by trknight78 on 2015. 7. 9..
 */
public class Herb {
    enum Type { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override public String toString() {
        return name;
    }
}
