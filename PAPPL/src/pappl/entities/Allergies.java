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
@Table(name = "allergies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Allergies.findAll", query = "SELECT a FROM Allergies a")
    , @NamedQuery(name = "Allergies.findByIdAllergies", query = "SELECT a FROM Allergies a WHERE a.idAllergies = :idAllergies")
    , @NamedQuery(name = "Allergies.findByNomAllergies", query = "SELECT a FROM Allergies a WHERE a.nomAllergies = :nomAllergies")
    , @NamedQuery(name = "Allergies.findByNiveau", query = "SELECT a FROM Allergies a WHERE a.niveau = :niveau")})
public class Allergies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_allergies")
    private Integer idAllergies;
    @Basic(optional = false)
    @Column(name = "nom_allergies")
    private String nomAllergies;
    @Basic(optional = false)
    @Column(name = "niveau")
    private int niveau;
    @JoinTable(name = "a", joinColumns = {
        @JoinColumn(name = "id_allergies", referencedColumnName = "id_allergies")}, inverseJoinColumns = {
        @JoinColumn(name = "id_patients", referencedColumnName = "id_patients")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Patients> patientsList;

    public Allergies() {
    }

    public Allergies(Integer idAllergies) {
        this.idAllergies = idAllergies;
    }

    public Allergies(Integer idAllergies, String nomAllergies, int niveau) {
        this.idAllergies = idAllergies;
        this.nomAllergies = nomAllergies;
        this.niveau = niveau;
    }

    public Integer getIdAllergies() {
        return idAllergies;
    }

    public void setIdAllergies(Integer idAllergies) {
        this.idAllergies = idAllergies;
    }

    public String getNomAllergies() {
        return nomAllergies;
    }

    public void setNomAllergies(String nomAllergies) {
        this.nomAllergies = nomAllergies;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
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
        hash += (idAllergies != null ? idAllergies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Allergies)) {
            return false;
        }
        Allergies other = (Allergies) object;
        if ((this.idAllergies == null && other.idAllergies != null) || (this.idAllergies != null && !this.idAllergies.equals(other.idAllergies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Allergies[ idAllergies=" + idAllergies + " ]";
    }
    
}
