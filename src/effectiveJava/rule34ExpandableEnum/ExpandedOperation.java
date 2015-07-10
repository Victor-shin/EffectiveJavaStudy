package effectiveJava.rule34ExpandableEnum;

/**
 * Created by trknight78 on 2015. 7. 10..
 */
public enum ExpandedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) { return Math.pow(x, y); }
    },
    REMAINDER("%") {
        public double apply(double x, double y) { return x % y; }
    },
    ;

    private final String symbol;

    ExpandedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
