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
public class AlertesView extends MainView {

    protected JPanel precedent;

    public AlertesView() {
        super();
        init();
    }

    public void init() {
        titre = new JLabel("MES ALERTES");
        titre.setFont(new Font("Calibri", Font.PLAIN, 24));
        titre.setHorizontalAlignment(JLabel.CENTER);
        titre.setVerticalAlignment(JLabel.CENTER);
        Bande.add(titre, BorderLayout.CENTER);
        Back.addActionListener(new BoutonListenerBack());
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        Add.addActionListener(new BoutonListenerAdd());
    }

    public void setPrecedent(DashboardView precedent) {
        this.precedent = precedent;
    }

    public void setPrecedent(MesuresView precedent) {
        this.precedent = precedent;
    }
    
        public void setPrecedent(Home precedent) {
        this.precedent = precedent;
    }

    class BoutonListenerBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (precedent instanceof MesuresView) {
                g.show("Mesures");
            } else {
                if (precedent instanceof DashboardView) {
                g.show("Dashboard");}
                else {

                        g.show("Home");
                      
                    
                }
            }
        }

    }
    
    class BoutonListenerAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            g.show("AjouterMesure");
            g.getAjout().setPrecedent(new AlertesView());
        }

    }
}
