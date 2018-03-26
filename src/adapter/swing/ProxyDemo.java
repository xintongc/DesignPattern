package adapter.swing;

import javax.swing.*;

public class ProxyDemo {
    public static void main(String[] args) {

        Interpreter.store.addInterpreter(new Interpreter() {//把单例对象依附在借口上
            @Override
            public void beforeCall() {
                System.out.println("Before call");
            }

            @Override
            public void afterCall() {
                System.out.println("After call");
            }
        });

        JFrame frame = Factroy.newFrame(); //拿到的是JFrame的之类
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
