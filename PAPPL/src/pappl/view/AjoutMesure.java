/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static pappl.view.FormulaireInscription.COULEUR1;
import static pappl.view.MainView.SCREENSIZE;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class AjoutMesure extends MainView {

    protected MainView precedent;

    protected JLabel choixMesureTxt = new JLabel("Quelle mesure voulez-vous saisir ?");
    protected JComboBox choixMesure;

    protected JLabel valeurTxt = new JLabel("Valeur mesurée");
    protected JFormattedTextField valeurChamp = new JFormattedTextField(new Double(0));

    protected JLabel unite = new JLabel();

    protected JButton confirmation = new JButton("Ok");

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

        choixMesureTxt.setFont(new Font("Calibri", Font.PLAIN, 20));
        valeurTxt.setFont(new Font("Calibri", Font.PLAIN, 20));
        unite.setFont(new Font("Calibri", Font.PLAIN, 20));
        //choixMesure.setFont(new Font("Calibri", Font.PLAIN, 20));
        String[] tab = {"", "Glycémie", "Tension", "Fréquence Cardiaque"};
        choixMesure = new JComboBox(tab);
        choixMesure.setPreferredSize(new Dimension(200, 30));
        choixMesure.addItemListener(new ComboListener());

        fond.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = 10;
        gbc.gridheight = 5;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(30, 0, 20, 10);
        fond.add(choixMesureTxt, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(30, 400, 20, 0);
        fond.add(choixMesure, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(200, 0, 20, 0);
        fond.add(valeurTxt, gbc);

        valeurChamp.setPreferredSize(new Dimension(50, 20));

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(200, 400, 20, 100);
        fond.add(valeurChamp, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(200, 500, 20, 0);
        fond.add(unite, gbc);
        unite.setVisible(false);

        confirmation.addActionListener(new ConfirmationListener());
        confirmation.setFont(new Font("Calibri", Font.PLAIN, 20));

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(400, 0, 20, 0);
        fond.add(confirmation, gbc);

    }

    public void setPrecedent(DashboardView precedent) {
        this.precedent = precedent;
    }

    public void setPrecedent(MesuresView precedent) {
        this.precedent = precedent;
    }
    
    public void setPrecedent(AlertesView precedent) {
        this.precedent = precedent;
    }

    public void setTxtUnite(String s) {
        this.unite.setText(s);
    }

    class BoutonListenerBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (precedent instanceof MesuresView) {
                g.addNew("Mesures");
                g.show("Mesures");
            } else {
                if (precedent instanceof DashboardView) {
                    g.addNew("Dashboard");
                    g.show("Dashboard");
                } else {
                    g.addNew("Alertes");
                    g.show("Alertes");
                }
            }
        }
    }


class ComboListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
        String choix = (String) e.getItem();
        switch (choix) {
            case "Glycémie":
                AjoutMesure.this.setTxtUnite("mg/dl");
                AjoutMesure.this.unite.setVisible(true);
                break;
            case "Fréquence Cardiaque":
                AjoutMesure.this.setTxtUnite("BPM");
                AjoutMesure.this.unite.setVisible(true);
                break;
            case "":
                AjoutMesure.this.unite.setVisible(false);
                break;
            case "Tension":
                AjoutMesure.this.setTxtUnite("mmHg");
                AjoutMesure.this.unite.setVisible(true);
                break;
        }
    }

}

class ConfirmationListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //Stocker cette nouvelle donnée en attente de confirmation du médecin
        ConfirmationPop confirmation = new ConfirmationPop();
        confirmation.setLocationRelativeTo(null);
        confirmation.setVisible(true);

    }

}

}
