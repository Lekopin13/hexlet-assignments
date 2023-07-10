package exercise;

import java.util.*;

// BEGIN
class App {
    public static boolean scrabble (String str1, String str2){

        List<Character> list1 = new LinkedList<>();
        for (int x = 0; x < str1.length(); x++) {
            list1.add(str1.toLowerCase().charAt(x));
        }

        List<Character> list2 = new LinkedList<>();
        for (int x = 0; x < str2.length(); x++) {
            list2.add(str2.toLowerCase().charAt(x));
        }

        for (int i = 0; i < list1.size(); i++){
            if (list2.contains(list1.get(i))){
                list2.remove(list1.get(i));
            }
        }

        return list2.isEmpty();
    }
}

//END
