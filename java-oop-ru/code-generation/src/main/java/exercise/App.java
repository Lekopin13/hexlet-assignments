package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
class App {
    public static void save(Path path, Car car) throws Exception{
         String json = car.serialize();
         Files.writeString(path, json, StandardOpenOption.WRITE);
    }

    public static Car extract(Path path) throws Exception {
        String json = Files.readString(path);
        Car instance = Car.unserialize(json);
        return instance;
    }
}
// END
