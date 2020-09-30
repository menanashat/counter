package javaapplication43;

import java.awt.Color;
import javax.swing.JFrame;

public class Main extends JFrame {

    Pa n = new Pa();

    public Main() {
        this.setTitle("Mina");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 600);
        this.setLocation(200, 20);
        this.add(n);
        n.setBackground(Color.gray);
    }

}
