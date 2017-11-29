/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class DashboardView extends MainView {
    
    protected javax.swing.JLabel latest;
    
    public DashboardView() {
        super();
        init();
        //this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        Back.addActionListener(new BoutonListenerBack()); 
    }
    
    class BoutonListenerBack implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            g.show("Home");
        }
    }
}
