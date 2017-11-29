
package pappl.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static test.Main.g;

/**
 * Classe des fenêtres de mesure
 * @author Khalil
 */
public class MesuresView extends MainView {
    
    protected javax.swing.JTable tableau;

    public MesuresView() {
        super();
        init();
        //this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void init() {
        PanelBack.setVisible(true);
        PanelAdd.setVisible(true);
        
        tableau = new javax.swing.JTable();
        scroll = new javax.swing.JScrollPane(tableau);
        
        Back.addActionListener(new BoutonListenerBack());
        
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mesure", "Valeur", "Date", "Source"
            }
        ));
        
        tableau.getTableHeader().setFont(new Font("Calibri",Font.PLAIN,20));
        
        
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
        
        
        //pack();
 
        
        
        
    }
    
        
class BoutonListenerBack implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            g.show("Home");
        }
    }
}
