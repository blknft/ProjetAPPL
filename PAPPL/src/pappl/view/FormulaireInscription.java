/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.DateFormat;
import javax.swing.*;
import static pappl.view.MainView.SCREENSIZE;

/**
 *
 * @author Khalil
 */
public class FormulaireInscription extends JFrame {

    public final static Color COULEUR1 = new Color(0, 153, 204);
    public final static Color COULEUR2 = new Color(0, 130, 204);
    protected javax.swing.JPanel main;

    private JTextField nomTxt = new JTextField();
    private JLabel nomLabel = new JLabel("Nom");

    private JTextField prenomTxt = new JTextField();
    private JLabel prenomLabel = new JLabel("Prénom");

    private JRadioButton m = new JRadioButton("M");
    private JRadioButton f = new JRadioButton("F");
    private ButtonGroup bg = new ButtonGroup();
    private JLabel sexeLabel = new JLabel("Sexe");

    private JFormattedTextField dateNaissTxt = new JFormattedTextField(DateFormat.getDateInstance());
    private JLabel dateNaissLabel = new JLabel("Date de naissance");

    private JTextField mailTxt = new JTextField();
    private JLabel mailLabel = new JLabel("Adresse Mail");

    public FormulaireInscription() {
        init();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        main = new javax.swing.JPanel();

        int height = SCREENSIZE.height * 2 / 3;
        int width = SCREENSIZE.width / 4;
        Dimension dim = new Dimension(width, height);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);
        this.setMaximumSize(dim);
        dim = new Dimension(130, 28);

        main.setLayout(new GridBagLayout());
        main.setBackground(COULEUR1);
        
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 5;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(0, 0, 10, 5);
        main.add(nomLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0, 0, 10, 0);
        nomTxt.setPreferredSize(dim);
        main.add(nomTxt, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(40, 0, 10, 5);
        main.add(prenomLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(40, 0, 10, 0);
        prenomTxt.setPreferredSize(dim);
        main.add(prenomTxt, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(10, 0, 10, 0);
        main.add(sexeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0, 0, 10, 0);
        JPanel boutons = new JPanel();
        boutons.setBackground(COULEUR1);
        boutons.add(m, gbc);
        boutons.add(f, gbc);
        main.add(boutons);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(10, 0, 10, 5);
        main.add(dateNaissLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(10, 0, 10, 0);
        dateNaissTxt.setPreferredSize(dim);
        main.add(dateNaissTxt, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(10, 0, 10, 5);
        main.add(mailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(10, 0, 10, 0);
        mailTxt.setPreferredSize(dim);
        main.add(mailTxt, gbc);

        this.setContentPane(main);
        pack();
    }
}
