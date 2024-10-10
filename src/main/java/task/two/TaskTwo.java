package task.two;

import task.three.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskTwo {

    private final int target = 13;

    protected Collection<Pair> findPairs(int[] tab) {

        if(tab.length < 2) return new ArrayList<>();

        List<Pair> collect = IntStream.of(tab)
                .parallel()
                .boxed()
                .flatMap(arg -> findPairsFnc(arg, tab).stream())
                .filter(opt -> !opt.isEmpty())
                .flatMap(s -> s.stream())
                .sorted(new PairComparator())
                .collect(Collectors.toList());


        generalDisplay(collect);

        return collect;
    }

    private Optional<List<Pair>> findPairsFnc(int arg, int[] tab) {

        List<Pair> p = null;

        for (int i : tab) {

            int s = arg + i;
            if (s == target) {

                if(p == null) p = new ArrayList<>();
                if(arg < i) {
                    p.add(new Pair(arg, i));
                }
            }
        }
        return Optional.ofNullable(p);
    }

    private void generalDisplay(Collection<Pair> c) {

        if(!c.isEmpty()) {
            for (Pair p : c) {
                System.out.println(p.getA() + "   " + p.getB());
            }
        }
    }
}
