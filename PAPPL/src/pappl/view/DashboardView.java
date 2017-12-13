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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static pappl.view.FormulaireInscription.COULEUR1;
import static pappl.view.FormulaireInscription.COULEUR2;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class DashboardView extends MainView {

    protected javax.swing.JLabel latest;
    protected JPanel panelGlycemie;
    protected JPanel panelFreq;
    protected JPanel panelTemperature;
    protected JPanel panelTension;
    
    protected JLabel labelGlycemie  = new JLabel("Glycémie");
    protected JLabel labelClicGlycemie = new JLabel("(Cliquez pour afficher l'évolution)");
    
    protected JLabel labelTension  = new JLabel("Tension");
    protected JLabel labelClicTension = new JLabel("(Cliquez pour afficher l'évolution)");
    
    protected JLabel labelTemperature  = new JLabel("Température");
    protected JLabel labelClicTemperature = new JLabel("(Cliquez pour afficher l'évolution)");
    
    protected JLabel labelFreq  = new JLabel("Fréquence Cardiaque");
    protected JLabel labelClicFreq = new JLabel("(Cliquez pour afficher l'évolution)");

    public DashboardView() {
        super();
        init();
    }

    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        panelGlycemie = new JPanel();
        panelFreq = new JPanel();
        panelTemperature = new JPanel();
        panelTension = new JPanel();
        Back.addActionListener(new BoutonListenerBack());
        Add.addActionListener(new BoutonListenerAdd());
        Alerte.addActionListener(new BoutonListenerAlertes());

        titre = new JLabel("DASHBOARD");
        titre.setFont(new Font("Calibri", Font.PLAIN, 24));
        titre.setHorizontalAlignment(JLabel.CENTER);
        titre.setVerticalAlignment(JLabel.CENTER);
        Bande.add(titre, BorderLayout.CENTER);
        Font policePanels = new Font("Calibri", Font.PLAIN, 20);
        Font policePanels2 = new Font("Calibri", Font.PLAIN, 14);

        //Panel View
        JPanel view = new JPanel();
        Dimension size = fond.getSize();
        view.setSize(size);
        size.setSize(size.getWidth() / 2, size.getHeight() / 2);

        //Panel Glycémie 
        panelGlycemie.setBackground(COULEUR1);
        panelGlycemie.setLayout(new BorderLayout());
        panelGlycemie.setPreferredSize(size);
        labelGlycemie.setFont(policePanels);
        labelClicGlycemie.setFont(policePanels2);
        labelGlycemie.setVerticalAlignment(JLabel.CENTER);
        labelGlycemie.setHorizontalAlignment(JLabel.CENTER);
        labelClicGlycemie.setVerticalAlignment(JLabel.CENTER);
        labelClicGlycemie.setHorizontalAlignment(JLabel.CENTER);
        panelGlycemie.add(labelGlycemie, BorderLayout.CENTER);
        panelGlycemie.add(labelClicGlycemie, BorderLayout.SOUTH);
        panelGlycemie.addMouseListener(new PanelGListener());

        //Panel Fréquence Cardiaque
        panelFreq.setBackground(COULEUR1);
        panelFreq.setLayout(new BorderLayout());
        panelFreq.setPreferredSize(size);

        labelFreq.setFont(policePanels);
        labelFreq.setVerticalAlignment(JLabel.CENTER);
        labelFreq.setHorizontalAlignment(JLabel.CENTER);


        labelClicFreq.setFont(policePanels2);
        labelClicFreq.setVerticalAlignment(JLabel.CENTER);
        labelClicFreq.setHorizontalAlignment(JLabel.CENTER);
        panelFreq.add(labelFreq, BorderLayout.CENTER);
        panelFreq.add(labelClicFreq, BorderLayout.SOUTH);
        panelFreq.addMouseListener(new PanelFListener());

        //Panel Température
        panelTemperature.setBackground(COULEUR1);
        panelTemperature.setLayout(new BorderLayout());
        panelTemperature.setPreferredSize(size);

        labelTemperature.setFont(policePanels);
        labelTemperature.setVerticalAlignment(JLabel.CENTER);
        labelTemperature.setHorizontalAlignment(JLabel.CENTER);
        panelTemperature.add(labelTemperature, BorderLayout.CENTER);
        labelClicTemperature.setFont(policePanels2);
        labelClicTemperature.setVerticalAlignment(JLabel.CENTER);
        labelClicTemperature.setHorizontalAlignment(JLabel.CENTER);
        panelTemperature.add(labelClicTemperature, BorderLayout.SOUTH);
        panelTemperature.addMouseListener(new PanelTempListener());

        //Panel Tension
        panelTension.setBackground(COULEUR1);
        panelTension.setLayout(new BorderLayout());
        panelTension.setPreferredSize(size);

        labelTension.setFont(policePanels);
        labelTension.setVerticalAlignment(JLabel.CENTER);
        labelTension.setHorizontalAlignment(JLabel.CENTER);
        panelTension.add(labelTension, BorderLayout.CENTER);
        labelClicTension.setFont(policePanels2);
        labelClicTension.setVerticalAlignment(JLabel.CENTER);
        labelClicTension.setHorizontalAlignment(JLabel.CENTER);
        panelTension.add(labelClicTension, BorderLayout.SOUTH);
        panelTension.addMouseListener(new PanelTListener());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(fond);
        fond.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        ));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(view);
        view.setLayout(jPanel2Layout);
        jPanel2Layout.setAutoCreateContainerGaps(true);
        jPanel2Layout.setAutoCreateGaps(true);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelGlycemie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                                .addComponent(panelFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                                .addComponent(panelTension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelGlycemie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                                .addComponent(panelTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                                .addComponent(panelTension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        )
        );

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

    class PanelGListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panelGlycemie.setBackground(COULEUR2);
            labelGlycemie.setVisible(false);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panelGlycemie.setBackground(COULEUR1);
            labelGlycemie.setVisible(true);
        }

    }

    class PanelFListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panelFreq.setBackground(COULEUR2);
            labelFreq.setVisible(false);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panelFreq.setBackground(COULEUR1);
            labelFreq.setVisible(true);
        }

    }

    class PanelTListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panelTension.setBackground(COULEUR2);
            labelTension.setVisible(false);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panelTension.setBackground(COULEUR1);
            labelTension.setVisible(true);
        }

    }

    class PanelTempListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panelTemperature.setBackground(COULEUR2);
            labelTemperature.setVisible(false);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panelTemperature.setBackground(COULEUR1);
            labelTemperature.setVisible(true);
        }

    }
    
    class BoutonListenerAlertes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            g.show("Alertes");
            g.getAlertes().setPrecedent(DashboardView.this);
        }
        
    }
}
