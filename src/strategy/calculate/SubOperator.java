package strategy.calculate;

public class SubOperator extends Operator{

    public SubOperator(int v1, int v2) {
        super(v1, v2);
    }

    @Override
    public int evaluate() {
        return v1 - v2;
    }
}
