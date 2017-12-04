/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oualidcheriaf
 */
@Embeddable
public class EnContactAvecPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_contact")
    private int idContact;
    @Basic(optional = false)
    @Column(name = "id_patients")
    private int idPatients;
    @Basic(optional = false)
    @Column(name = "id_medecins")
    private int idMedecins;

    public EnContactAvecPK() {
    }

    public EnContactAvecPK(int idContact, int idPatients, int idMedecins) {
        this.idContact = idContact;
        this.idPatients = idPatients;
        this.idMedecins = idMedecins;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public int getIdPatients() {
        return idPatients;
    }

    public void setIdPatients(int idPatients) {
        this.idPatients = idPatients;
    }

    public int getIdMedecins() {
        return idMedecins;
    }

    public void setIdMedecins(int idMedecins) {
        this.idMedecins = idMedecins;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idContact;
        hash += (int) idPatients;
        hash += (int) idMedecins;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnContactAvecPK)) {
            return false;
        }
        EnContactAvecPK other = (EnContactAvecPK) object;
        if (this.idContact != other.idContact) {
            return false;
        }
        if (this.idPatients != other.idPatients) {
            return false;
        }
        if (this.idMedecins != other.idMedecins) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.EnContactAvecPK[ idContact=" + idContact + ", idPatients=" + idPatients + ", idMedecins=" + idMedecins + " ]";
    }
    
}
