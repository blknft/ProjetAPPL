package pappl.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import static pappl.view.MainView.SCREENSIZE;
import static test.Main.g;

/**
 *
 * @author Khalil
 */
public class Home extends javax.swing.JPanel {

    protected javax.swing.JPanel mainPanel;
    protected javax.swing.JPanel panelDashboard;
    protected javax.swing.JPanel panelMesure;
    protected javax.swing.JPanel panelAlerte;
    protected javax.swing.JPanel panelDeco;
    protected javax.swing.JLabel labelDashboard;
    protected javax.swing.JLabel labelMesure;
    protected javax.swing.JLabel labelAlerte;
    protected javax.swing.JLabel labelDeco;

    public Home() {
        inithome();
        this.setVisible(true);
    }

    private void inithome() {
        mainPanel = new javax.swing.JPanel();
        panelDashboard = new javax.swing.JPanel();
        panelMesure = new javax.swing.JPanel();
        panelAlerte = new javax.swing.JPanel();
        panelDeco = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        labelMesure = new javax.swing.JLabel();
        labelAlerte = new javax.swing.JLabel();
        labelDeco = new javax.swing.JLabel();

        panelDashboard.addMouseListener(new PanelListenerDashboard());
        panelMesure.addMouseListener(new PanelListenerMesures());
        panelAlerte.addMouseListener(new PanelListenerAlertes());

        //Dimension size = this.getContentPane().getSize();
        //size.setSize(size.getWidth() / 4, size.getHeight() / 4);
        Font police = new Font("Calibri", Font.PLAIN, 24);

        int height = SCREENSIZE.height * 2 / 3;
        int width = SCREENSIZE.width * 2 / 3;
        this.setPreferredSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width, height));
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //FOND
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        //GESTION DU PANEL DASHBOARD 
        panelDashboard.setBackground(new java.awt.Color(0, 153, 204));
        panelDashboard.setPreferredSize(new Dimension(width / 4, height / 4));
        panelDashboard.setLayout(new BorderLayout());

        labelDashboard.setText("Dashboard");
        labelDashboard.setFont(police);
        labelDashboard.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/dashboard.png"));
        panelDashboard.add(labelDashboard, BorderLayout.CENTER);

        mainPanel.add(panelDashboard);

        //GESTION DU PANEL MESURE
        panelMesure.setBackground(new java.awt.Color(0, 130, 204));
        panelMesure.setPreferredSize(new Dimension(width / 4, height / 4));
        panelMesure.setLayout(new BorderLayout());

        labelMesure.setText("Mesures");
        labelMesure.setFont(police);
        labelMesure.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/graph.png"));
        panelMesure.add(labelMesure, BorderLayout.CENTER);

        mainPanel.add(panelMesure);

        //GESTION DU PANEL ALERTE
        panelAlerte.setBackground(new java.awt.Color(0, 153, 204));
        panelAlerte.setPreferredSize(new Dimension(width / 4, height / 4));
        panelAlerte.setLayout(new BorderLayout());

        labelAlerte.setText("Alertes");
        labelAlerte.setFont(police);
        labelAlerte.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/warning.png"));
        panelAlerte.add(labelAlerte, BorderLayout.CENTER);

        mainPanel.add(panelAlerte);

        //GESTION DU PANEL DECO
        panelDeco.setBackground(new java.awt.Color(0, 130, 204));
        panelDeco.setPreferredSize(new Dimension(width / 4, height / 4));
        panelDeco.setLayout(new BorderLayout());

        labelDeco.setText("Déconnexion");
        labelDeco.setFont(police);
        labelDeco.setIcon(new javax.swing.ImageIcon("/Users/Khalil/Desktop/ECN/INFORMATIQUE/PAPPL/DÉVELOPPEMENT/PAPPL/icones/turn-off.png"));
        panelDeco.add(labelDeco, BorderLayout.CENTER);

        mainPanel.add(panelDeco);

        //RESIZE MAIN PANEL
        javax.swing.GroupLayout fameuxLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(fameuxLayout);
        fameuxLayout.setHorizontalGroup(
                fameuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMesure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAlerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDeco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fameuxLayout.setVerticalGroup(
                fameuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fameuxLayout.createSequentialGroup()
                                .addComponent(panelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelMesure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelAlerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelDeco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        ));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //pack();
    }

    class PanelListenerDashboard implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            g.show("Dashboard");
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    class PanelListenerMesures implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            g.show("Mesures");
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    class PanelListenerAlertes implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            g.show("Alertes");
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

}
