/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Khalil
 */
public class PatientMainView extends javax.swing.JFrame {

    /**
     * Creates new form PatientView
     */
    public PatientMainView() {
        initComponents();
        Add.setVisible(false);
        Delete.setVisible(false);
        Back.setVisible(false);
    }
    /**
     * Getters
     */
    public JButton getAdd() {
        return Add;
    }

    public JButton getBack() {
        return Back;
    }


    public JPanel getBande() {
        return Bande;
    }

    public JButton getDelete() {
        return Delete;
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Bande = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bande.setBackground(new java.awt.Color(0, 153, 204));
        Bande.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/substract.png")); // NOI18N
        Bande.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 60, 100));

        Add.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/add.png")); // NOI18N
        Bande.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 60, 100));

        Back.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/back-2.png")); // NOI18N
        Bande.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Bande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton Add;
    protected javax.swing.JButton Back;
    protected javax.swing.JPanel Bande;
    protected javax.swing.JButton Delete;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
