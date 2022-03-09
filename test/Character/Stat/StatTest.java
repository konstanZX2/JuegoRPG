package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    Stat stat;
    @BeforeEach
    void setUp() {
        stat = new StatMock(5);
    }

    @Test
    void getValue() {
        assertEquals(5,stat.getValue());

    }

    @Test
    void increase() {
        stat.increase();
        assertEquals(6,stat.getValue());
    }

    @Test
    void decrease() {
        stat.decrease();
        assertEquals(4,stat.getValue());
    }
}