import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstTests {
    @Test
    public void firstTest() throws Exception {
        bracketsForTest bracket = new bracketsForTest();
        boolean answer = bracket.Predict("([{}])");
        assertEquals(answer, true);
    }

    @Test
    public void secondTest() throws Exception {
        bracketsForTest bracket = new bracketsForTest();
        boolean answer = bracket.Predict("([]{})(([]({})))");
        assertEquals(answer, true);
    }

    @Test
    public void thirdTest() throws Exception {
        bracketsForTest bracket = new bracketsForTest();
        boolean answer = bracket.Predict("[[({})(()]]");
        assertEquals(answer, false);
    }

    @Test
    public void fourthTest() throws Exception {
        bracketsForTest bracket = new bracketsForTest();
        boolean answer = bracket.Predict("[[({})(()]]");
        assertEquals(answer, true);
    }
}
