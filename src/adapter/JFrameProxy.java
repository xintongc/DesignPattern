package adapter;

import javax.swing.*;
import java.util.List;

public class JFrameProxy extends JFrame {

    @Override
    public void setVisible(boolean b) {
        //System.out.println("will set visible");//可以加一些事件处理
        List<Interpreter> interpreters = Interpreter.store.interpreters;
        for (Interpreter interpreter: interpreters) {
            interpreter.beforeCall();
        }

        super.setVisible(b);
        //System.out.println("did set visible");
        for (Interpreter interpreter: interpreters) {
            interpreter.afterCall();
        }
    }
}
