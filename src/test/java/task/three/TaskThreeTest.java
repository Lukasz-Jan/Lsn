package task.three;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TaskThreeTest {

    TaskThree task = new TaskThree();

    @Test
    void fechRoots_1() {
        List<Pair> pairs = prepareData_1();
        int roots = task.fechRoots(pairs);
        assertEquals(2, roots);
    }

    @Test
    void fechRoots_2() {
        List<Pair> pairs = prepareData_2();
        int roots = task.fechRoots(pairs);
        assertEquals(2, roots);
    }

    @Test
    void fechRoots_3() {
        List<Pair> pairs = prepareData_3();
        int roots = task.fechRoots(pairs);
        assertEquals(1, roots);
    }

    @Test
    void fechRoots_4() {
        List<Pair> pairs = prepareData_4();
        int roots = task.fechRoots(pairs);
        assertEquals(3, roots);
    }

    @Test
    void fechRoots_5() {
        List<Pair> pairs = prepareData_5();
        int roots = task.fechRoots(pairs);
        assertEquals(3, roots);
    }

    @Test
    void fechRoots_6() {
        List<Pair> pairs = prepareData_6();
        int roots = task.fechRoots(pairs);
        assertEquals(3, roots);
    }

    private List<Pair> prepareData_6() {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(3, 0));

        list.add(new Pair(9, 10));

        list.add(new Pair(1000, 2000));

        list.add(new Pair(1500, 3000));

        list.add(new Pair(100001, 1500));

        list.add(new Pair(100001, 33));

        list.get(0).setA(list.size()-1);
        return list;
    }

    private List<Pair> prepareData_4() {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(10, 0));

        list.add(new Pair(1, 2));
        list.add(new Pair(9, 10));
        list.add(new Pair(18,19));
        list.add(new Pair(2, 10));
        list.add(new Pair(33, 34));
        list.add(new Pair(101, 102));
        list.add(new Pair(101, 102));
        list.add(new Pair(101, 102));
        list.add(new Pair(34, 52));
        list.add(new Pair(22, 34));
        list.add(new Pair(201, 102));
        list.add(new Pair(101, 22));
        list.add(new Pair(2, 55));

        list.get(0).setA(list.size()-1);

        return list;
    }

    private List<Pair> prepareData_3() {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(3, 0));

        list.add(new Pair(1, 2));
        list.add(new Pair(2, 3));
        list.add(new Pair(4,5));
        list.add(new Pair(3,4));
        list.get(0).setA(list.size()-1);
        return list;
    }

    private List<Pair> prepareData_2() {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(1, 0));

        list.add(new Pair(1, 2));
        list.add(new Pair(2, 3));
        list.add(new Pair(4,5));
        list.get(0).setA(list.size()-1);
        return list;
    }

    private List<Pair> prepareData_1() {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(3, 0));

        list.add(new Pair(4, 3));
        list.add(new Pair(1, 4));
        list.add(new Pair(5,6));
        list.get(0).setA(list.size()-1);
        return list;
    }




    private List<Pair> prepareData_5() {

        List<Pair> list = new ArrayList<>();

        list.add(new Pair(10, 0));
        list.add(new Pair(1, 2));
        list.add(new Pair(9, 10));
        list.add(new Pair(18,19));
        list.add(new Pair(2, 10));
        list.add(new Pair(33, 34));
        list.add(new Pair(101, 102));
        list.add(new Pair(101, 102));
        list.add(new Pair(101, 102));
        list.add(new Pair(34, 52));
        list.add(new Pair(22, 34));
        list.add(new Pair(201, 102));
        list.add(new Pair(101, 22));
        list.add(new Pair(2, 55));

        list.get(0).setA(list.size()-1);
        return list;
    }


}