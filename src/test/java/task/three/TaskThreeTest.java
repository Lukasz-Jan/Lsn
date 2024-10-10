package task.three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskThreeTest {

    private int inputRoots = 0;

    private int toInputSize = 0;

    private TaskThree task = new TaskThree();

    @Test
    void processInputOne() {

        List<Pair> inputListOne = createInputListOne();

//        for (Pair p: inputListOne) {
//            System.out.println(p.toString());
//        }

        int roots = task.processInput(inputListOne);
        assertEquals(inputRoots, roots);
    }

    @Test
    void processInputListTwo() {

        List<Pair> inputListTwo = createInputListWithDuplicates();

        for (Pair p: inputListTwo) {
            System.out.println(p.toString());
        }

        int roots = task.processInput(inputListTwo);
        assertEquals(inputRoots, roots);
    }

    private List<Pair> createInputListWithDuplicates() {

        List<Pair> inputListOne = new ArrayList<>();

        int toInput = 100;
        inputListOne.add(new Pair(toInput, 0));
        toInputSize++;

        Pair p = null;
        for(int i = 0; i < toInput; i++) {
            p = new Pair(toInput - i, toInput - i -1);
            inputListOne.add(p);
            toInputSize++;
        }

        inputListOne.add(p);
        toInputSize++;
        inputListOne.add(p);
        toInputSize++;
        inputListOne.add(p);
        toInputSize++;

        inputRoots++;

        for(int i = 0; i < 10; i++) {
            p = new Pair(1000 - i, 1000 - i -1);
            inputListOne.add(p);
            toInputSize++;
        }
        inputRoots++;


        for(int i = 0; i < 10; i++) {
            p = new Pair(2000 - i, 2000 - i -1);
            inputListOne.add(p);
            toInputSize++;
        }


        inputRoots++;

        for(int i = 0; i < 10; i++) {
            p = new Pair(3000 - i, 3000 - i -1);
            inputListOne.add(p);
            toInputSize++;
        }

        inputListOne.add(p);
        toInputSize++;
        inputListOne.add(p);
        toInputSize++;
        inputListOne.add(p);
        toInputSize++;

        inputRoots++;

        inputListOne.get(0).setA(--toInputSize);       // first position only length

        return inputListOne;
    }

    private List<Pair> createInputListOne() {

        List<Pair> inputList = new ArrayList<>();

        int toInput = 100;
        inputList.add(new Pair(toInput, 0));
        toInputSize++;

        Pair p = null;
        for(int i = 0; i < toInput; i++) {
            p = new Pair(toInput - i, toInput - i -1);
            inputList.add(p);
            toInputSize++;
        }

        inputRoots++;

        for(int i = 0; i < 10; i++) {
            p = new Pair(1000 - i, 1000 - i -1);
            inputList.add(p);
            toInputSize++;
        }
        inputRoots++;


        for(int i = 0; i < 10; i++) {
            p = new Pair(2000 - i, 2000 - i -1);
            inputList.add(p);
            toInputSize++;
        }


        inputRoots++;

        for(int i = 0; i < 10; i++) {
            p = new Pair(3000 - i, 3000 - i -1);
            inputList.add(p);
            toInputSize++;
        }
        inputRoots++;

        inputList.get(0).setA(--toInputSize);       // first position only length

        return inputList;
    }


    @BeforeEach
    void setUp() {


    }



    @AfterEach
    void tearDown() {
    }


}