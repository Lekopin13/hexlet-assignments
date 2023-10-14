package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String str) {

        String[] lines = str.split("\n");
        return Arrays.stream(lines)
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(kv -> kv.startsWith("X_FORWARDED_"))
                .map(kv -> kv.replaceFirst("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
