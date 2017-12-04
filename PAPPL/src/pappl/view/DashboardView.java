/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static pappl.view.FormulaireInscription.COULEUR1;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class DashboardView extends MainView {

    protected javax.swing.JLabel latest;
    protected JPanel panelGlycemie;
    protected JPanel panelFreq;
    protected JPanel panelPoids;

    public DashboardView() {
        super();
        init();
    }

    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        JPanel view = new JPanel();
        scroll = new JScrollPane(view);
        panelGlycemie = new JPanel();
        panelFreq = new JPanel();
        panelPoids = new JPanel();
        Back.addActionListener(new BoutonListenerBack());
        Add.addActionListener(new BoutonListenerAdd());

        titre = new JLabel("DASHBOARD");
        titre.setFont(new Font("Calibri", Font.PLAIN, 24));
        titre.setHorizontalAlignment(JLabel.CENTER);
        titre.setVerticalAlignment(JLabel.CENTER);
        Bande.add(titre, BorderLayout.CENTER);

        //Panel View
        view.setBackground(new Color(255, 255, 255));
        view.setLayout(new GridBagLayout());
        Dimension size = view.getSize();
        size.setSize((size.getWidth() / 3) - 10, (size.getHeight() / 2) - 10);
        GridBagConstraints gbc = new GridBagConstraints();

        //Panel Glycémie 
        panelGlycemie.setBackground(COULEUR1);
        panelGlycemie.setLayout(new BorderLayout());
        panelGlycemie.setPreferredSize(size);
        panelGlycemie.setMaximumSize(size);
        gbc.gridx = gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 10, 5);
        JLabel labelGlycemie = new JLabel("Glycémie");
        labelGlycemie.setFont(new Font("Calibri", Font.PLAIN, 16));
        labelGlycemie.setVerticalAlignment(JLabel.CENTER);
        labelGlycemie.setHorizontalAlignment(JLabel.CENTER);
        panelGlycemie.add(labelGlycemie, BorderLayout.CENTER);

        view.add(panelGlycemie, gbc);

//Panel Fréquence Cardiaque
        panelFreq.setBackground(COULEUR1);

        //Panel Poids 
        panelPoids.setBackground(COULEUR1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(fond);
        fond.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        
        //Mise à jour précédent
    }

    class BoutonListenerBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            g.show("Home");
        }
    }

    class BoutonListenerAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            g.show("AjouterMesure");
            g.getAjout().setPrecedent(new DashboardView());
        }

    }
}
