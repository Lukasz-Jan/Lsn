package task.three;

public class Pair {

    private int a;

    private int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String
    toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int getB() { return b; }
}
