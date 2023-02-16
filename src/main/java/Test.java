import task1.ConvertListToString;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println(ConvertListToString.convertListToStringMethod(new ArrayList<>(Arrays.asList("Sofia",
                "Mike", "Hanna", "Alise", "Alex", "Andrew", "July"))));
        System.out.println(ConvertListToString.convertListToUpperListSortedMethod(new ArrayList<>(Arrays.asList("Sofia",
                "Mike", "Hanna", "Alise", "Alex", "Andrew", "July"))));
        System.out.println(ConvertListToString.convertArrayToListSortedNumbersMethod(new String[]{"1, 2, 0", "4, 5"}));
        System.out.println(ConvertListToString.getRandomStream(25214903917L,11,(long) Math.pow(2, 48),0,10));
        Stream<Integer> stream1 = Stream.of(5, 7, 1, 3,10,4);
        Stream<Integer> stream2 = Stream.of(2, 3,11);
        System.out.println(ConvertListToString.zip(stream1, stream2));
    }
}
