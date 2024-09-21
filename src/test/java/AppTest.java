import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testCalculateSum() {
        int result = CloverTestClass.calculateSum(44,55);
        assertEquals(99, result);
    }
}
