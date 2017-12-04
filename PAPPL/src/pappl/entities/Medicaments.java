/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author oualidcheriaf
 */
@Entity
@Table(name = "medicaments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicaments.findAll", query = "SELECT m FROM Medicaments m")
    , @NamedQuery(name = "Medicaments.findByIdMedicaments", query = "SELECT m FROM Medicaments m WHERE m.idMedicaments = :idMedicaments")
    , @NamedQuery(name = "Medicaments.findByNomMedicaments", query = "SELECT m FROM Medicaments m WHERE m.nomMedicaments = :nomMedicaments")
    , @NamedQuery(name = "Medicaments.findByFreqMedicaments", query = "SELECT m FROM Medicaments m WHERE m.freqMedicaments = :freqMedicaments")
    , @NamedQuery(name = "Medicaments.findByDureeMedicaments", query = "SELECT m FROM Medicaments m WHERE m.dureeMedicaments = :dureeMedicaments")})
public class Medicaments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_medicaments")
    private Integer idMedicaments;
    @Basic(optional = false)
    @Column(name = "nom_medicaments")
    private String nomMedicaments;
    @Basic(optional = false)
    @Column(name = "freq_medicaments")
    private String freqMedicaments;
    @Basic(optional = false)
    @Column(name = "duree_medicaments")
    private String dureeMedicaments;
    @JoinTable(name = "prend", joinColumns = {
        @JoinColumn(name = "id_medicaments", referencedColumnName = "id_medicaments")}, inverseJoinColumns = {
        @JoinColumn(name = "id_patients", referencedColumnName = "id_patients")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Patients> patientsList;

    public Medicaments() {
    }

    public Medicaments(Integer idMedicaments) {
        this.idMedicaments = idMedicaments;
    }

    public Medicaments(Integer idMedicaments, String nomMedicaments, String freqMedicaments, String dureeMedicaments) {
        this.idMedicaments = idMedicaments;
        this.nomMedicaments = nomMedicaments;
        this.freqMedicaments = freqMedicaments;
        this.dureeMedicaments = dureeMedicaments;
    }

    public Integer getIdMedicaments() {
        return idMedicaments;
    }

    public void setIdMedicaments(Integer idMedicaments) {
        this.idMedicaments = idMedicaments;
    }

    public String getNomMedicaments() {
        return nomMedicaments;
    }

    public void setNomMedicaments(String nomMedicaments) {
        this.nomMedicaments = nomMedicaments;
    }

    public String getFreqMedicaments() {
        return freqMedicaments;
    }

    public void setFreqMedicaments(String freqMedicaments) {
        this.freqMedicaments = freqMedicaments;
    }

    public String getDureeMedicaments() {
        return dureeMedicaments;
    }

    public void setDureeMedicaments(String dureeMedicaments) {
        this.dureeMedicaments = dureeMedicaments;
    }

    @XmlTransient
    public List<Patients> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patients> patientsList) {
        this.patientsList = patientsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicaments != null ? idMedicaments.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicaments)) {
            return false;
        }
        Medicaments other = (Medicaments) object;
        if ((this.idMedicaments == null && other.idMedicaments != null) || (this.idMedicaments != null && !this.idMedicaments.equals(other.idMedicaments))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Medicaments[ idMedicaments=" + idMedicaments + " ]";
    }
    
}
