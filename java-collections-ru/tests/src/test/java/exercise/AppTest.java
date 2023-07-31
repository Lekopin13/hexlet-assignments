package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int number = 3;
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> actual = App.take(numbers1, number);
        Assertions.assertIterableEquals(expected, actual);
        // END
    }
}
