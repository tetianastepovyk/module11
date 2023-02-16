import task1.ConvertListToString;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Sofia", "Mike", "Hanna", "Alise", "Alex", "Andrew", "July"));
        Stream<Integer> stream1 = Stream.of(5, 7, 1, 3, 10, 4);
        Stream<Integer> stream2 = Stream.of(2, 3, 11);

        System.out.println(ConvertListToString.convertListToStringMethod(nameList));
        System.out.println(ConvertListToString.convertListToUpperListSortedMethod(nameList));
        System.out.println(ConvertListToString.convertArrayToListSortedNumbersMethod(new String[]{"1, 2, 0", "4, 5"}));
        System.out.println(ConvertListToString.getRandomStream(25214903917L, 11, (long) Math.pow(2, 48), 0, 10).collect(Collectors.toList()));
        System.out.println(ConvertListToString.zip(stream1, stream2).collect(Collectors.toList()));
    }
}
