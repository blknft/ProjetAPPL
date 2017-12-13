/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static pappl.view.FormulaireInscription.COULEUR1;
import static pappl.view.MainView.SCREENSIZE;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class ConfirmationPop extends JFrame {

    public ConfirmationPop() {
        super();
        init();
    }

    public void init() {
        this.setUndecorated(true);
        this.getContentPane().setBackground(COULEUR1);
        this.getContentPane().setLayout(new GridBagLayout());

        JLabel message = new JLabel("La mesure a bien été prise en compte");
        JButton retour = new JButton("Retour");
        retour.addActionListener(new RetourListener());

        int height = SCREENSIZE.height * 1 / 8;
        int width = SCREENSIZE.width * 1 / 3;
        Dimension dim = new Dimension(width, height);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(0, 0, 10, 0);
        this.getContentPane().add(message, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 0, 0);
        this.getContentPane().add(retour, gbc);
    }

    class RetourListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            g.setEnabled(true);
            g.addNew("AjouterMesure");
            g.show("AjouterMesure");
            ConfirmationPop.this.dispose();
        }

    }
}
