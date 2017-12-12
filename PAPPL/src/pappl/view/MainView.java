package pappl.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public abstract class MainView extends javax.swing.JPanel {

    protected javax.swing.JButton Add;
    protected javax.swing.JButton Back;
    protected javax.swing.JButton Home;
    protected javax.swing.JPanel Bande;
    protected javax.swing.JPanel PanelBack;
    protected javax.swing.JPanel PanelAdd;
    protected javax.swing.JPanel fond;
    protected javax.swing.JButton Delete;
    protected javax.swing.JButton Alerte;
    protected javax.swing.JScrollPane scroll;
    protected javax.swing.JTable tableau;
    protected JLabel titre;

    public final static Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();

    public MainView() {
        initComponents();
        PanelBack.setVisible(false);
        PanelAdd.setVisible(false);
        PanelBack.setVisible(false);
    }

    private void initComponents() {

        Bande = new javax.swing.JPanel();
        PanelBack = new javax.swing.JPanel();
        PanelAdd = new javax.swing.JPanel();
        fond = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Alerte = new javax.swing.JButton();
        
        Home.addActionListener(new BoutonListenerHome());
        

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        int height = SCREENSIZE.height * 2 / 3;
        int width = SCREENSIZE.width * 2 / 3;
        Dimension dim = new Dimension(width, height);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);

        fond.setBackground(new java.awt.Color(255, 255, 255));
        fond.setLayout(new BorderLayout());

        Bande.setBackground(new java.awt.Color(0, 153, 204));
        Bande.setLayout(new BorderLayout());

        PanelBack.setBackground(new java.awt.Color(0, 153, 204));
        PanelBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAdd.setBackground(new java.awt.Color(0, 153, 204));
        PanelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bande.add(PanelBack, BorderLayout.WEST);
        Bande.add(PanelAdd, BorderLayout.EAST);

        Delete.setIcon(new javax.swing.ImageIcon("icones/substract.png")); // NOI18N
        PanelAdd.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 100));

        Add.setIcon(new javax.swing.ImageIcon("icones/add.png")); // NOI18N
        PanelAdd.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 100));

        Back.setIcon(new javax.swing.ImageIcon("icones/back-2.png")); // NOI18N
        PanelBack.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 100));

        Home.setIcon(new javax.swing.ImageIcon("icones/home-2.png")); // NOI18N
        PanelBack.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 100));

        Alerte.setIcon(new javax.swing.ImageIcon("icones/warning.png")); // NOI18N
        PanelBack.add(Alerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, 100));
        

        javax.swing.GroupLayout fondLayout = new javax.swing.GroupLayout(fond);
        fond.setLayout(fondLayout);
        fondLayout.setHorizontalGroup(
                fondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        fondLayout.setVerticalGroup(
                fondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 568, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Bande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(Bande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //pack();
    }

    class BoutonListenerHome implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent arg0) {
            g.show("Home");
        }
    }
  
}
