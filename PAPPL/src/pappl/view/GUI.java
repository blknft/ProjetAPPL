/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.*;
import javax.swing.*;
import static pappl.view.MainView.SCREENSIZE;

/**
 *
 * @author Khalil
 */
public class GUI extends JFrame {
    private CardLayout cardlayout = new CardLayout();
    private JPanel contentPanel;
    private JPanel precedent;
    
    
    
    public GUI() {
        super();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Dimensions de la fenêtre
        int height = SCREENSIZE.height * 2 / 3;
        int width = SCREENSIZE.width * 2 / 3;
        Dimension dim = new Dimension(width, height);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);
        
        
        //Initialisation des Panels
        contentPanel = new JPanel();
        precedent = new JPanel();
        
        //CardLayout
        contentPanel.setLayout(cardlayout);
        contentPanel.add(precedent, "Précédent");
        contentPanel.add(new Home(), "Home");
        contentPanel.add(new MesuresView(), "Mesures");
        contentPanel.add(new DashboardView(), "Dashboard");
        this.setContentPane(contentPanel);
        cardlayout.show(contentPanel, "Mesures"); 
    }
    
    public void show (String name) {
        cardlayout.show(contentPanel, name);
        
    }

    public void setPrecedent(JPanel p) {
        this.precedent = p;
    }
    
    
    
}
