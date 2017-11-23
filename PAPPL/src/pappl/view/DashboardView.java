/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.Font;

/**
 *
 * @author Khalil
 */
public class DashboardView extends MainView {
    
    protected javax.swing.JLabel latest;
    
    public DashboardView() {
        super();
        init();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        
       
        
    }
}
