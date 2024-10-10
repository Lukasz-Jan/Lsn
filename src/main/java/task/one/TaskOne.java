package task.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskOne {

    protected Output generalOutput(int[] tab) {

        Output out = new Output();

        Collection<Integer> sortedCollect = sortInput(tab);

        Collection<Integer> distinctCollect = sortedCollect
                .stream().parallel()
                .distinct()
                .collect(Collectors.toList());


        out.setCollect(sortedCollect);
        out.setNoOfElements(tab.length);
        out.setNoOfDistinctElements(distinctCollect.size());

        ArrayList<Integer> list = (ArrayList) distinctCollect;
        out.setMinVal(list.get(0));
        out.setMaxVal(list.get(list.size()-1));

        return out;
    }


    protected Collection<Integer> sortInput(int[] tab) {

        Collection<Integer> collect = IntStream.of(tab)
                .parallel()
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);


        return collect;
    }

}
