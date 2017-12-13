package test;

import pappl.DAO.DAOPatient;
import pappl.entitiesmongo.Patient;
import pappl.view.GUI;

import javax.persistence.EntityManagerFactory;

public class Main {
    public static GUI g = new GUI();
    public static EntityManagerFactory factory;
    public static final String MONGO_PROVIDER = "PAPPLPU";
    public static void main(String[] args) {
//        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        g.setLocationRelativeTo(null);
//        g.setVisible(true);
        DAOPatient dao = new DAOPatient();
        Patient pat = dao.find(1);
        System.out.println(pat);
    }
}
