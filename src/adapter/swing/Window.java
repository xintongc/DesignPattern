package adapter.swing;

import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame frame;

    public Window() {
        frame = new JFrame();
        frame.setLayout(null);
    }

    public void setFrame(int x, int y, int width, int height){
        frame.setLocation(x,y);
        frame.setSize(width,height);
    }

    public void display(){
        frame.setVisible(true);
    }

    public void addSubview(Component component){
        frame.add(component);
    }
}
