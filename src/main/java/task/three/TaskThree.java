package task.three;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {

    private int roots = 0;

    private List<Pair> pairList;

    protected int processInput(List<Pair> list) {

        if (list == null || list.size() < 2) return 0;

        int size = list.get(0).a;

        pairList = new ArrayList<>(size);
        pairList.addAll(list.subList(1, size + 1));

        sortInPair(pairList);

        pairList = pairList.stream().parallel().sorted(new PairComparator()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("\nResult  list:");
        for(Pair p : pairList) {
            System.out.println(p.toString());
        }


        searchRoots(pairList);

        return roots;
    }

    private void searchRoots(List<Pair> pairList) {

        if(pairList == null || pairList.size() == 0) throw new IllegalArgumentException();

        int lastIdx = pairList.size() - 1;

        Pair lastPair = pairList.get(lastIdx);

        if (lastPair != null) {
            roots++;
        }

        while (lastIdx > -1) {

            int lastA = lastPair.getA();
            lastIdx--;
            if (lastIdx > 0) {

                     //Pair lastButOnePair = pairList.get(lastIdx);
                    //int lastButOneA = lastButOnePair.getA();
                    int lastButOneA = pairList.get(lastIdx).getA();

                    if (lastA == lastButOneA) {
                        lastPair = pairList.get(lastIdx);
                        continue;
                    }

                    if (lastA != ++lastButOneA) {
                        roots++;
                    }
                    lastPair = pairList.get(lastIdx);
            }
        }
    }

    private void sortInPair(List<Pair> pairs) {

        for (Pair p : pairs) {
            if (p.a > p.b) {
                int temp = p.a;
                p.a = p.b;
                p.b = temp;
            }
        }
    }
}
