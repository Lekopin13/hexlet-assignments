package exercise;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// BEGIN
public class Validator {
    public static List validate(Object obj) {
        List<String> result = new ArrayList<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            NotNull notNull = field.getAnnotation(NotNull.class);
            if (notNull != null) {
                result.add(field.getName());
                try {
                    field.setAccessible(true);
                    field.set(obj, String.valueOf(field));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
// END
