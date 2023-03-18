import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({"3, 200, 300",
                "3, 100, 150",
                "10, 100, 361",
                "1, 121, 140"
    })

     public void test(int expected, int low, int upper) {
        SQRService service = new SQRService();

        int actual = (int) service.squareCounter(low, upper);

        assertEquals(expected, actual);
    }
}