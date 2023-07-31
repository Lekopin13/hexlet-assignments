package exercise;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List findWhere(List<Map<String, String>> list, Map<String, String> map) {
        List<Map> myList = new ArrayList<>();
        myList.add(map);
        List<Map> result = new ArrayList<>();
        for (Map element : list) {
            if (element.size() != map.size()) {
                for (Object key : element.keySet()) {
                    if (element.get(key).equals(map.get(key))) {
                        result.add(element);
                    }
                }
            } else {
                Set<String> values1 = new HashSet<>(element.values());
                Set<String> values2 = new HashSet<>(map.values());
                if (values1.equals(values2)) {
                    result.add(element);
                }
            }
        }
        List<Map> deduped = result.stream().distinct().collect(Collectors.toList());
        return deduped;
    }
}
//END
