package task.two;

import task.three.Pair;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {

        return  Integer.compare(o1.getA(), o2.getA());
    }
}
