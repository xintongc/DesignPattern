package adapter.swing;

import javax.swing.*;

public class Old {
    public static void main(String[] args) {
        Window window = new Window();
        window.setFrame(400,200, 100,20);

        JLabel label = new JLabel();
        label.setText("Label");
        label.setLocation(10,10);
        label.setSize(100,30);
        window.addSubview(label);
        window.display();

    }
}
