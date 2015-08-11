package guava;

import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by trknight78 on 2015. 7. 22..
 */
public class HelloGuava {

    static class Cloud {
        int foo;
        String bar;

        Cloud(int foo, String bar) {
            this.foo = foo;
            this.bar = bar;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(foo, bar);
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) return true;

            return false;
        }
    }

    public static void testCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("must be positive: " + count);
        }
    }

    // in Guava
    public static void testCountWithGuava(int count) {
        checkArgument(count > 0, "must be positive: %s", count);
    }

    public static void main(String[] args) {

//        testCount(-1);
//        testCountWithGuava(-1);

        Cloud c1 = new Cloud(1, "Number1");
        Cloud c2 = new Cloud(1, "Number1");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

    }
}
