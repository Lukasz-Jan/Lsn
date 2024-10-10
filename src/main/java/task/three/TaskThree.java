package task.three;

import java.util.*;

public final class TaskThree {


    private final Map<Integer, Set<Integer>> connections = new HashMap<>(10_000);


    protected int fechRoots(List<Pair> pairList) {

        if (pairList == null || pairList.isEmpty()) throw new IllegalArgumentException();

        fillMapWithConnections(pairList);

        int i = processRoots();
        System.out.println(i);
        return i;
    }

    private int processRoots()  {

        int no = 0;

        Deque<Integer> qu = new ArrayDeque<>(100);

        Set<Integer> connectionKeys = null;

        while(!connections.isEmpty()) {
            connectionKeys = connections.keySet();

            if (!connectionKeys.isEmpty()) {

                Integer root = connectionKeys.iterator().next();
                addVerticesToQueue(qu, connections.get(root));
                connections.remove(root);

                while (!qu.isEmpty()) {

                    Integer currentVtx = qu.pop();
                    Set<Integer> vertices = connections.get(currentVtx);
                    if (vertices != null) {
                        addVerticesToQueue(qu, vertices);
                    }
                    connections.remove(currentVtx);
                }
                no++;
            }
        }

        return no;
    }

    private void  addVerticesToQueue(Deque<Integer> qu, Set<Integer> vertices) {

        for(Integer vtx: vertices) {

            if(connections.containsKey(vtx)){
                qu.add(vtx);
            }
        }
    }


    private void fillMapWithConnections(List<Pair> pairList) {

        int size = pairList.size();

        for (int i = 1; i < pairList.size(); i++) {
            Pair p = pairList.get(i);
            addPairToConnections(p);
        }
    }

    private void addPairToConnections(Pair p) {

        int a = p.getA();
        int b = p.getB();
        Set<Integer> setA = connections.get(a);

        if(setA == null) {
            setA = new HashSet<>();
            connections.put(a, setA);
        }
        setA.add(b);

        Set<Integer> setB = connections.get(b);
        if(setB == null) {
            setB = new HashSet<>();
            connections.put(b, setB);
        }
        setB.add(a);
    }


    private void displayConnections() {

        Set<Map.Entry<Integer, Set<Integer>>> entries = connections.entrySet();

        for(    Map.Entry<Integer, Set<Integer>> en: entries)  {

            System.out.println(en.getKey() + ":   " + en.getValue());
        }
    }

    public Map<Integer, Set<Integer>> getConnections() {
        return Map.copyOf(connections);
    }
}
