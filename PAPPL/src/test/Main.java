package test;

import pappl.entitiesmongo.DAO.DAOPatient;
import pappl.entitiesmongo.model.*;
import pappl.view.GUI;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static GUI g = new GUI();
    public static EntityManagerFactory factory;
    public static final String MONGO_PROVIDER = "PAPPLPU";

    public static void main(String[] args) {
        g.show("Mesures");
        g.setVisible(true);

        DAOPatient dao = new DAOPatient();
        Patient pat = dao.find(1);


    }

    public static void setupMongoDb(DAOPatient dao) {
        System.out.println("Combien de patient voulez vous ajoutez ? ");
        Scanner sc = new Scanner(System.in);
        int nbPatient = sc.nextInt();
        System.out.println(" Combien de mesures voulez vous ajouter par patient ?");
        int nbMesures = sc.nextInt();
        ArrayList<Patient> aAjouter;
        aAjouter = new ArrayList<>();
        Random random;
        random = new Random();
        for (int i = 0; i < nbPatient; i++) {
            Patient pat = new Patient();
            pat.setId((int) dao.getMongoCollection().count() + 1);
            pat.setNom("Patient n " + i);
            pat.setPrenom("Prenom " + i);
            pat.setAdresse(i + " rue de la noe");
            pat.setGlycemie(new ArrayList<>());
            for (int j = 0; j < nbMesures; j++) {
                Glycemie glycemie = new Glycemie();
                glycemie.setValeur(random.nextDouble());
                glycemie.setDate("Today");
                pat.getGlycemie().add(glycemie);
            }
            pat.setBPM(new ArrayList<>());
            for (int j = 0; j < nbMesures; j++) {
                BPM bpm = new BPM();
                bpm.setValeur(random.nextInt(120));
                bpm.setDate("Today");
                pat.getBPM().add(bpm);
            }
            pat.setTemperature(new ArrayList<>());
            for (int j = 0; j < nbMesures; j++) {
                Temperature temp = new Temperature();
                temp.setValeur(random.nextDouble());
                temp.setDate("Today");
                pat.getTemperature().add(temp);
            }
            pat.setTension(new ArrayList<>());
            for (int j = 0; j < nbMesures; j++) {
                Tension tens = new Tension();
                tens.setValeur(random.nextDouble());
                tens.setDate("Today");
                pat.getTension().add(tens);
            }
            dao.addPatient(pat);
            System.out.println("Patient ajouté");
        }
    }
}
