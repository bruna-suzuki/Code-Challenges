package challenges;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = List.of("bruna", "java", "stream", "logica");
        List<String> uppercaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}
