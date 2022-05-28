package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForGITConflict {

    @Test
    void firstCompare () {
        Assertions.assertTrue( 4 > 3);
    }

    @Test
    void secondCompare () {
        Assertions.assertTrue( 10 > 3);
    }
}
