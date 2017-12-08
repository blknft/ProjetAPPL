/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.view;

import java.awt.*;
import javax.swing.*;
import static pappl.view.MainView.SCREENSIZE;

/**
 *
 * @author Khalil
 */
public class GUI extends JFrame {

    private CardLayout cardlayout = new CardLayout();
    private JPanel contentPanel;
    private JPanel precedent;
    private Home home;
    private MesuresView mesures;
    private DashboardView dashboard;
    private AjoutMesure ajout;
    private AlertesView alertes;

    public GUI() {
        super();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Initialisation panels
        home = new Home();
        mesures = new MesuresView();
        dashboard = new DashboardView();
        ajout = new AjoutMesure();
        alertes = new AlertesView();

        //Dimensions de la fenêtre
        int height = SCREENSIZE.height * 2 / 3;
        int width = SCREENSIZE.width * 2 / 3;
        Dimension dim = new Dimension(width, height);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);

        //Initialisation des Panels
        contentPanel = new JPanel();
        precedent = new JPanel();

        //CardLayout
        contentPanel.setLayout(cardlayout);
        contentPanel.add(precedent, "Précédent");
        contentPanel.add(home, "Home");
        contentPanel.add(mesures, "Mesures");
        contentPanel.add(dashboard, "Dashboard");
        contentPanel.add(ajout, "AjouterMesure");
        contentPanel.add(alertes, "Alertes");
        this.setContentPane(contentPanel);

        cardlayout.show(contentPanel, "Home");
    }

    public final void addNew(String name) {
        switch (name) {
            case "Mesures":
                contentPanel.remove(mesures);
                this.mesures = new MesuresView();
                contentPanel.add(mesures, "Mesures");
                break;
            case "Dashboard":
                contentPanel.remove(dashboard);
                this.dashboard = new DashboardView();
                contentPanel.add(dashboard, "Dashboard");
                break;
            case "AjouterMesure":
                contentPanel.remove(ajout);
                this.ajout = new AjoutMesure();
                contentPanel.add(ajout, "AjouterMesure");
                break;
            case "Alertes":
                contentPanel.remove(alertes);
                this.alertes = new AlertesView();
                contentPanel.add(alertes, "Alertes");
                break;
        }
    }

    public void show(String name) {
        cardlayout.show(contentPanel, name);
    }

    public void showprecedent() {
        if (this.precedent instanceof DashboardView) {
            this.show("Dashboard");
        } else {
            if (this.precedent instanceof MesuresView) {
                this.show("Mesures");
            }
        }
    }

    public void setPrecedent(JPanel p) {
        this.precedent = p;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public void setMesures(MesuresView mesures) {
        this.mesures = mesures;
    }

    public void setDashboard(DashboardView dashboard) {
        this.dashboard = dashboard;
    }

    public void setAjout(AjoutMesure ajout) {
        this.ajout = ajout;
    }

    public AjoutMesure getAjout() {
        return ajout;
    }
    
    public AlertesView getAlertes() {
        return alertes;
    }

}
