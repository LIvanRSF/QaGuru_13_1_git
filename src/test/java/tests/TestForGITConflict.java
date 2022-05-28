package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForGITConflict {

    @Test
    void firstCompare () {
        Assertions.assertEquals(4,4);
    }

    @Test
    void secondCompare () {
        Assertions.assertEquals( 10,10);
    }
}
