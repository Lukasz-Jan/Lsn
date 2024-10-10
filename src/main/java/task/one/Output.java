package task.one;

import java.util.Collection;

public class Output {

    private Collection<Integer> collect;

    int noOfElements;

    int noOfDistinctElements;

    int minVal;

    int maxVal;

    public void display() {

        System.out.println();
        for(Integer i: collect) {
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("count: " + noOfElements);
        System.out.println("distinct: " + noOfDistinctElements);
        System.out.println("min: " + minVal);
        System.out.println("min: " + maxVal);
    }

    public Collection<Integer> getCollect() {
        return collect;
    }

    public void setCollect(Collection<Integer> collect) {
        this.collect = collect;
    }

    public int getNoOfElements() {
        return noOfElements;
    }

    public void setNoOfElements(int noOfElements) {
        this.noOfElements = noOfElements;
    }

    public int getNoOfDistinctElements() {
        return noOfDistinctElements;
    }

    public void setNoOfDistinctElements(int noOfDistinctElements) {
        this.noOfDistinctElements = noOfDistinctElements;
    }

    public int getMinVal() {
        return minVal;
    }

    public void setMinVal(int minVal) {
        this.minVal = minVal;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }
}
