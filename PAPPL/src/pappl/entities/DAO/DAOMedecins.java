package pappl.entities.DAO;

import pappl.entities.Medecins;

import javax.persistence.Query;
import java.util.ArrayList;

public class DAOMedecins extends DAOPostgres {

    public ArrayList<Medecins> findAll() {
        Query q = this.getEm().createNamedQuery("Medecins.findAll");
        ArrayList<Medecins> res = (ArrayList<Medecins>) q.getResultList();
        return res;
    }

    public Medecins find(int id) {
        Query q = this.getEm().createNamedQuery("Medecins.findByIdMedecins");
        Medecins med = (Medecins) q.setParameter("idMedecins", id).getSingleResult();
        return med;
    }

    public void add(Medecins med) {
        this.getEm().getTransaction().begin();
        this.getEm().persist(med);
        this.getEm().getTransaction().commit();
    }

}
