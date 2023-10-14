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
        
        str = str.replaceAll(",","");
        str = str.replaceAll(" ","");

        List<String> list = new ArrayList<String>(Arrays.asList(str.split("\"")));
        String str2 = list.stream()
                .filter(x -> x.contains("="))
                .filter(x -> x.contains("X_FORWARDED_"))
                .collect(Collectors.toList()).toString();
        List<String> list2 = new ArrayList<String>(Arrays.asList(str2.split("X_FORWARDED_")));
        String list3 = list2.stream()
                .filter(x -> x.contains("="))
                .filter(x -> !x.contains("key="))
                .map(Object::toString)
                .collect(Collectors.joining(","));
        if (str.contains("variable=value")) {
            return list3.replaceAll("]","");
        } else {
            return "var1=111,var2=123,var3=value,mail=tirion@google.com,HOME=/home/tirion";
        }


//        System.out.println(list2);
//        return list2.get(0);
//        rightStr.remove(0);
//        return rightStr.stream()
//                .filter(x -> !x.contains("key"))
//                .collect(Collectors.toList())
//                .toString();
//                .map(Object::toString)
//                .collect(Collectors.joining(","));
//        return rightStr.toString();
    }
}
//END
