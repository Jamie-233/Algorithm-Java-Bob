package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrameExample {
    public static void main(String[] args) {

        // GUI create run in a new thread
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("JFrame");
            frame.setSize(650, 500);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
