package adapter.swing;

import java.util.LinkedList;
import java.util.List;

public interface Interpreter {
    void beforeCall();
    void afterCall();

    static class Store{
        List<Interpreter> interpreters = new LinkedList<>();

        public void addInterpreter(Interpreter interpreter){
            interpreters.add(interpreter);
        }
    }

    static Store store = new Store(); //单例对象，store公用一个linkedlist
}
