/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class AjoutMesure extends MainView {
    
    protected MainView precedent;

    public AjoutMesure() {
        super();
        this.PanelAdd.setVisible(false);
        this.PanelBack.setVisible(true);
        init();
    }

    public void init() {

        titre = new JLabel("AJOUTER UNE MESURE");
        titre.setFont(new Font("Calibri", Font.PLAIN, 24));
        titre.setHorizontalAlignment(JLabel.CENTER);
        titre.setVerticalAlignment(JLabel.CENTER);
        Bande.add(titre, BorderLayout.CENTER);
        Back.addActionListener(new BoutonListenerBack());
        
        
    }

    public void setPrecedent(DashboardView precedent) {
        this.precedent = precedent;
    }
    
    public void setPrecedent(MesuresView precedent) {
        this.precedent = precedent;
    }
    
    
    
    

    class BoutonListenerBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (precedent instanceof MesuresView) {
                g.addNew("Mesures");
                g.show("Mesures");
            }
            else {
                g.addNew("Dashboard");
                g.show("Dashboard");  
            }
        }
    }

}
