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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "pathologies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pathologies.findAll", query = "SELECT p FROM Pathologies p")
    , @NamedQuery(name = "Pathologies.findByIdPathologies", query = "SELECT p FROM Pathologies p WHERE p.idPathologies = :idPathologies")
    , @NamedQuery(name = "Pathologies.findByNomPathologies", query = "SELECT p FROM Pathologies p WHERE p.nomPathologies = :nomPathologies")})
public class Pathologies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pathologies")
    private Integer idPathologies;
    @Basic(optional = false)
    @Column(name = "nom_pathologies")
    private String nomPathologies;
    @JoinTable(name = "souffre", joinColumns = {
        @JoinColumn(name = "id_pathologies", referencedColumnName = "id_pathologies")}, inverseJoinColumns = {
        @JoinColumn(name = "id_patients", referencedColumnName = "id_patients")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Patients> patientsList;

    public Pathologies() {
    }

    public Pathologies(Integer idPathologies) {
        this.idPathologies = idPathologies;
    }

    public Pathologies(Integer idPathologies, String nomPathologies) {
        this.idPathologies = idPathologies;
        this.nomPathologies = nomPathologies;
    }

    public Integer getIdPathologies() {
        return idPathologies;
    }

    public void setIdPathologies(Integer idPathologies) {
        this.idPathologies = idPathologies;
    }

    public String getNomPathologies() {
        return nomPathologies;
    }

    public void setNomPathologies(String nomPathologies) {
        this.nomPathologies = nomPathologies;
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
        hash += (idPathologies != null ? idPathologies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pathologies)) {
            return false;
        }
        Pathologies other = (Pathologies) object;
        if ((this.idPathologies == null && other.idPathologies != null) || (this.idPathologies != null && !this.idPathologies.equals(other.idPathologies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Pathologies[ idPathologies=" + idPathologies + " ]";
    }
    
}
