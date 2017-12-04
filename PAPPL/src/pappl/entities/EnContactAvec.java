/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oualidcheriaf
 */
@Entity
@Table(name = "en__contact_avec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnContactAvec.findAll", query = "SELECT e FROM EnContactAvec e")
    , @NamedQuery(name = "EnContactAvec.findByIdContact", query = "SELECT e FROM EnContactAvec e WHERE e.enContactAvecPK.idContact = :idContact")
    , @NamedQuery(name = "EnContactAvec.findByIdPatients", query = "SELECT e FROM EnContactAvec e WHERE e.enContactAvecPK.idPatients = :idPatients")
    , @NamedQuery(name = "EnContactAvec.findByIdMedecins", query = "SELECT e FROM EnContactAvec e WHERE e.enContactAvecPK.idMedecins = :idMedecins")})
public class EnContactAvec implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnContactAvecPK enContactAvecPK;
    @JoinColumn(name = "id_medecins", referencedColumnName = "id_medecins", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medecins medecins;
    @JoinColumn(name = "id_patients", referencedColumnName = "id_patients", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Patients patients;

    public EnContactAvec() {
    }

    public EnContactAvec(EnContactAvecPK enContactAvecPK) {
        this.enContactAvecPK = enContactAvecPK;
    }

    public EnContactAvec(int idContact, int idPatients, int idMedecins) {
        this.enContactAvecPK = new EnContactAvecPK(idContact, idPatients, idMedecins);
    }

    public EnContactAvecPK getEnContactAvecPK() {
        return enContactAvecPK;
    }

    public void setEnContactAvecPK(EnContactAvecPK enContactAvecPK) {
        this.enContactAvecPK = enContactAvecPK;
    }

    public Medecins getMedecins() {
        return medecins;
    }

    public void setMedecins(Medecins medecins) {
        this.medecins = medecins;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enContactAvecPK != null ? enContactAvecPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnContactAvec)) {
            return false;
        }
        EnContactAvec other = (EnContactAvec) object;
        if ((this.enContactAvecPK == null && other.enContactAvecPK != null) || (this.enContactAvecPK != null && !this.enContactAvecPK.equals(other.enContactAvecPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.EnContactAvec[ enContactAvecPK=" + enContactAvecPK + " ]";
    }
    
}
