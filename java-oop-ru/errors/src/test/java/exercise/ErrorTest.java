package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ErrorTest {
    @Test
    void negativeRadiusException() {
        var error = new NegativeRadiusException("Не удалось посчитать площадь");
        assertThat(error).isInstanceOf(Exception.class);
    }
}
