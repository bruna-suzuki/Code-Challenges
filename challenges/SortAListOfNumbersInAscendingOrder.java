package challenges;

import java.util.List;
import java.util.stream.Collectors;

public class SortAListOfNumbersInAscendingOrder {
    public static void main(String[] args){

        List<Integer> numbers = List.of(5, 1, 4, 2);

        List<Integer> order = numbers.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(order);
    }
}
