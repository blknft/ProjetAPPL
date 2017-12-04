package test;

import javax.swing.*;
import pappl.view.*;

public class Main {
    public static GUI g = new GUI();
    
    public static void main(String[] args) {
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }
}
