import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static final String STRING = "Привет! Я Тузик, мне 3 года. Заберите меня из приюта(";

    private static String[] splitString(String str, String regex){
        String[] array = str.split(regex);
        return array;
    }

    public static void main(String[] args) {
        String[] arr = splitString(STRING, ("[\\s!,(.]"));
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
