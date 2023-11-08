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
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonBook = mapper.writeValueAsString(this);
        return jsonBook;
    }

    public static Car unserialize(String str) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(str, Car.class);
    }
    // END
}
