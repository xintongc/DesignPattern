package adapter;

import javax.swing.*;

public class Factroy {
    public static JFrame newFrame(){
        return new JFrameProxy();
    }
}
