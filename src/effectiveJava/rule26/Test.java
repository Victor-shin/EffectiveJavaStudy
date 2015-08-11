package effectiveJava.rule26;

public class Test {

    public interface UnaryFunction<T> {
        T apply(T arg);
    }

    private static UnaryFunction<Object> IDENTITY_FUNCTION =
        new UnaryFunction<Object>() {
            public Object apply(Object arg) { return arg; }
        };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    public static void main(String[] args) {
        String[] strings = {"jute", "hemp", "nylon"};

        UnaryFunction<String> sameString = Test.identityFunction();

        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = Test.identityFunction();
        for(Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}
