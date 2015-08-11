package fun;

/**
 * Created by trknight78 on 2015. 8. 5..
 */
public class EndCommaInArray {
    public static void main(String[] args) {
        String[] strings = {
                "A",
                "B",
        };

        for(String str : strings)
            System.out.println(str);

        System.out.println(strings.length);
    }
}
