package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForGITConflict {

    @Test
    void firstCompare() {
        Assertions.assertTrue(10 > 5);
    }

    @Test
    void secondCompare() {
        Assertions.assertTrue(100 > 5);
    }
}
