package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize(Car car) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonBook = mapper.writeValueAsString(car);
        return jsonBook;
    }

    public static Car unserialize(String str) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(str, Car.class);
        return car;
    }
    // END
}
