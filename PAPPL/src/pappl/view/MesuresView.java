package pappl.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static test.Main.g;

/**
 * Classe des fenêtres de mesure
 *
 * @author Khalil
 */
public class MesuresView extends MainView {

    protected javax.swing.JTable tableau;

    public MesuresView() {
        super();
        init();
    }

    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        tableau = new javax.swing.JTable();
        scroll = new javax.swing.JScrollPane(tableau);
        titre = new JLabel("MESURES");
        titre.setFont(new Font("Calibri", Font.PLAIN, 24));
        titre.setHorizontalAlignment(JLabel.CENTER);
        titre.setVerticalAlignment(JLabel.CENTER);
        Bande.add(titre, BorderLayout.CENTER);

        Back.addActionListener(new BoutonListenerBack());
        Add.addActionListener(new BoutonListenerAdd());

        tableau.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Mesure", "Valeur", "Date", "Source"
                }
        ));

        tableau.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 20));

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
            g.getAjout().setPrecedent(new MesuresView());
        }

    }
}
