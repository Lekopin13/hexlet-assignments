package exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.text.SimpleDateFormat;

// BEGIN
class Sorter {
    public static List takeOldestMans(List<Map<String, String>> list) {
        Comparator<Map<String,String>> sortByAge = Comparator.comparing(x -> x.get("birthday"));
        List <Map<String,String>> sortedList = list.stream().sorted(sortByAge).collect(Collectors.toList());
        List <Map<String,String>> sortedList2 = sortedList.stream().filter(x -> x.containsValue("male")).collect(Collectors.toList());
        return sortedList2.stream().map(name -> name.get("name")).collect(Collectors.toList());
    }
}
// END
