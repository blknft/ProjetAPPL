package pappl.DAO;

import com.mongodb.client.FindIterable;
import org.bson.Document;
import pappl.entitiesmongo.*;

import java.util.ArrayList;

public class DAOPatient extends DAOMongo {
    public DAOPatient() {
        super();
    }

    public Patient find(int id) {
        Patient pat = null;
        FindIterable<Document> result;
        result = this.getMongoCollection().find(new Document("ID", id));
        if (result == null)
            return null;
        else
            for (Document current : result) {
                pat = this.constructObject(current);
            }
        return pat;
    }

    public ArrayList<Patient> findAll() {
        FindIterable<Document> result;
        result = this.getMongoCollection().find();
        ArrayList<Patient> patients;
        patients = new ArrayList<>();
        for (Document current : result) {
            patients.add(this.constructObject(current));
        }
        return patients;
    }

    public void addPatient(Patient pat) {
        Document patient = this.constructDocument(pat);
        this.getMongoCollection().insertOne(patient);
    }

    public void deletePatient(Patient pat) {
        this.getMongoCollection().deleteOne(this.constructDocument(pat));
    }

    public void updatePatient(Patient pat) {
        //this.getMongoCollection().findOneAndReplace(pat.getId(),this.constructDocument(pat));
        //FIXME : Voir comment update les mesures.
    }

    protected Patient constructObject(Document data) {
        Patient pat = new Patient();
        pat.setNom(data.getString("Nom"));
        pat.setPrenom(data.getString("Prenom"));
        pat.setAdresse(data.getString("Adresse"));
        pat.setId(data.getInteger("ID"));
        // préparation de la liste des tensions
        ArrayList<Tension> listTension = new ArrayList<>();
        for (Document current : (ArrayList<Document>) data.get("Tension")) {
            Tension tens = new Tension();
            tens.setValeur(current.getDouble("valeur"));
            tens.setDate(current.getString("date"));
            listTension.add(tens);
        }
        pat.setTension(listTension);

        ArrayList<BPM> listBPM = new ArrayList<>();
        for (Document current : (ArrayList<Document>) data.get("BPM")) {
            BPM bpm = new BPM();
            bpm.setValeur(current.getInteger("valeur"));
            bpm.setDate(current.getString("date"));
            listBPM.add(bpm);
        }
        pat.setBPM(listBPM);
        ArrayList<Glycemie> listGlycemie = new ArrayList<>();
        for (Document current : (ArrayList<Document>) data.get("Glycemie")) {
            Glycemie gly = new Glycemie();
            gly.setValeur(current.getDouble("valeur"));
            gly.setDate(current.getString("date"));
            listGlycemie.add(gly);
        }
        pat.setGlycemie(listGlycemie);
        ArrayList<Temperature> listTemperature = new ArrayList<>();
        for (Document current : (ArrayList<Document>) data.get("Temperature")) {
            Temperature temp = new Temperature();
            temp.setValeur(current.getDouble("valeur"));
            temp.setDate(current.getString("date"));
            listTemperature.add(temp);
        }
        pat.setTemperature(listTemperature);

        return pat;
    }

    protected Document constructDocument(Patient pat) {
        Document doc;
        doc = new Document().append("Nom", pat.getNom()).append("Prenom", pat.getPrenom()).append("Adresse", pat.getAdresse()).append("ID", pat.getId()).append("Temperature", pat.getTemperature()).append("Glycemie", pat.getGlycemie()).append("BPM", pat.getBPM()).append("Tension", pat.getTension());
        return doc;
    }
}