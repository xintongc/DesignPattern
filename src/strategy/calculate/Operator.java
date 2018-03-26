package strategy.calculate;

public abstract class Operator {
    protected int v1;
    protected int v2;

    public Operator(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public abstract int evaluate();

}
