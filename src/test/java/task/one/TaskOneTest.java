package task.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

class TaskOneTest {

    @Test
    void generalOutputTest() {

        TaskOne ob = new TaskOne();

        int tab[] = { Integer.MAX_VALUE, 499, 101, 5555,9999,8888, 8888,3, 77,22, 10001, 222, 1_223_999_888, Integer.MIN_VALUE};

        Output output = ob.generalOutput(tab);

        output.display();

    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}