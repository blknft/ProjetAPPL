/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import javax.swing.*;
import static javax.swing.BoxLayout.PAGE_AXIS;
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
        dim = new Dimension(150,28);

        main.setLayout(new BoxLayout(main, PAGE_AXIS));

        JPanel nom = new JPanel();
        Font police = new Font("Calibri",Font.PLAIN,14);
        nom.setBackground(COULEUR1);
        nomTxt.setFont(police);
        nomTxt.setPreferredSize(dim);
        nomLabel.setFont(police);
        nom.add(nomLabel);
        nom.add(nomTxt);
        nom.setMaximumSize(new Dimension(width,50));
        nom.setPreferredSize(new Dimension(width,50));
        nom.setMinimumSize(new Dimension(width,50));
        main.add(nom);

        
        JPanel prenom = new JPanel();
        prenom.setBackground(COULEUR2);
        prenomTxt.setFont(police);
        prenomTxt.setPreferredSize(dim);
        prenomLabel.setFont(police);
        prenom.add(prenomLabel);
        prenom.add(prenomTxt);
        prenom.setMaximumSize(new Dimension(width,50));
        prenom.setPreferredSize(new Dimension(width,50));
        prenom.setMinimumSize(new Dimension(width,50));
        main.add(prenom);
        
        JPanel sexe = new JPanel();
        sexe.setBackground(COULEUR1);
        m.setFont(police);
        f.setFont(police);
        sexeLabel.setFont(police);
        sexe.setMaximumSize(new Dimension(width,50));
        sexe.setPreferredSize(new Dimension(width,50));
        sexe.setMinimumSize(new Dimension(width,50));
        sexe.add(sexeLabel);
        sexe.add(m);
        sexe.add(f);
        main.add(sexe);
        
        JPanel date = new JPanel();
        date.setBackground(COULEUR2);
        dateNaissTxt.setFont(police);
        dateNaissTxt.setPreferredSize(dim);
        dateNaissLabel.setFont(police);
        date.add(dateNaissLabel);
        date.add(dateNaissTxt);
        date.setMaximumSize(new Dimension(width,50));
        date.setPreferredSize(new Dimension(width,50));
        date.setMinimumSize(new Dimension(width,50));
        main.add(date);

        this.setContentPane(main);
        pack();
    }
}
