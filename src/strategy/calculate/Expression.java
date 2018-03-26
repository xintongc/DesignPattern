package strategy.calculate;

public class Expression {
    public int evaluate(int v1, int v2, String operatorString){
        Operator operator = null;
        if (operatorString.equals("+")){
            operator = new AddOperator(v1,v2);
        } else if (operatorString.equals("-")){
            operator = new SubOperator(v1,v2);
        }

        return operator.evaluate();
    }


    public static void main(String[] args) {
        Expression expression = new Expression();
        int result = expression.evaluate(1,2,"-");
        System.out.println(result);
    }
}
