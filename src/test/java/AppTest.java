import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    @Test
    public void 더하기_테스트() {
        int a = 10 + 5;
        assertEquals(15, a);
        int rs = Calculator.run("10 + 20");

        assertEquals(30, rs);
    }

    @Test
    public void 더하기_테스트_2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }
}
