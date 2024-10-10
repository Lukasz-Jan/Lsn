package task.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task.three.Pair;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    private TaskTwo ob = new TaskTwo();

    @Test
    void sortInputOne() {

        int[] tab = {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};

        Collection<Pair> pairs = ob.findPairs(tab);

    }

    @Test
    void sortInput() {

        int[] tab = {1, 2, 10, 7, 5, 3, 6, 6, 13, 0, 12, 1, 7, 6};

        Collection<Pair> pairs = ob.findPairs(tab);

    }

    @Test
    void smallArray() {

        int[] tab = {1};
        Collection<Pair> pairs = ob.findPairs(tab);
    }

    @Test
    void emptyArray() {

        int[] tab = {};
        Collection<Pair> pairs = ob.findPairs(tab);


    }

    @Test
    void noMatch() {

        int[] tab = {1, 2};
        Collection<Pair> pairs = ob.findPairs(tab);


    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}