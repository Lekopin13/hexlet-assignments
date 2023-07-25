package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String str1) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] ignored = str1.split(" ");

        for (final String s : ignored) {
            if (s.isEmpty()) {
                continue;
            }
            final String lowerS = s.toLowerCase();
            if (map.containsKey(lowerS)) {
                map.put(lowerS, map.get(lowerS) + 1);
            } else {
                map.put(lowerS, 1);
            }
        }
        System.out.println(map);
        return map;
    }

    public static String toString(Map map) {
        if (map.isEmpty()) {
            return "{}";
        } else {
            StringBuilder mapAsString = new StringBuilder("[" + "\n");
            for (Object key : map.keySet()) {
                mapAsString.append("  " + key + ": " + map.get(key) + "\n");
            }
            mapAsString.delete(mapAsString.length(), mapAsString.length()).append("]");
            return mapAsString.toString();
        }
    }
}
//END
