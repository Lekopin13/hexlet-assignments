package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class AppTest {
    @Test
    void testGenDiff1() {
        Map<String, Object> data1 = new HashMap<>();
        Map<String, Object> data2 = new HashMap<>();
        Map<String, String> expected = new HashMap<>();
        assertThat(App.genDiff(data1, data2)).isEqualTo(expected);
    }



}
