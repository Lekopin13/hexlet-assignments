package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> list) {
        long result1 = list.stream()
                .filter(str -> str.endsWith("yandex.ru"))
                .count();
        long result2 = list.stream()
                .filter(str -> str.endsWith("gmail.com"))
                .count();
        long result3 = list.stream()
                .filter(str -> str.endsWith("hotmail.com"))
                .count();
        return result1 + result2 + result3;
    }
}
// END
