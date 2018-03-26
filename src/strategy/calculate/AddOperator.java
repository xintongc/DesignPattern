package strategy.calculate;

public class AddOperator extends Operator {
    public AddOperator(int v1, int v2) {
        super(v1, v2);
    }

    @Override

    public int evaluate() {
        return v1 + v2;
    }
}
