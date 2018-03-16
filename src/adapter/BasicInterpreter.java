package adapter;

public class BasicInterpreter implements Interpreter {
    @Override
    public void beforeCall() {
        System.out.println("Before Call");
    }

    @Override
    public void afterCall() {
        System.out.println("After Call");

    }
}
