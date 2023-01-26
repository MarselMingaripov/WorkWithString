import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static int countWords(List<String> list, String word) {
        return Collections.frequency(list, word);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String str = scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        for (String string : str.split(" ")) {
            stringList.add(string);
        }
        System.out.println("В тексте " + stringList.size() + " слов");

        Map<String, Long> frequency =
                stringList.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        frequency.values().stream().sorted(Long::compareTo);

        for (Map.Entry<String, Long> stringLongEntry : frequency.entrySet()) {
            System.out.println(stringLongEntry);
        }
    }
}
