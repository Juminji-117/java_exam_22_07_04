import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트() {
        int a = 10 + 5;
        assertEquals(15, a); // static import 편하게 하려면 ctrl+1
        // 단정문: 15 나오기를 기대한다
    }
}
