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
@Table(name = "reeducation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reeducation.findAll", query = "SELECT r FROM Reeducation r")
    , @NamedQuery(name = "Reeducation.findByIdReeduc", query = "SELECT r FROM Reeducation r WHERE r.idReeduc = :idReeduc")
    , @NamedQuery(name = "Reeducation.findByTypeReeduc", query = "SELECT r FROM Reeducation r WHERE r.typeReeduc = :typeReeduc")
    , @NamedQuery(name = "Reeducation.findByDureeReeduc", query = "SELECT r FROM Reeducation r WHERE r.dureeReeduc = :dureeReeduc")
    , @NamedQuery(name = "Reeducation.findByFreqReeduc", query = "SELECT r FROM Reeducation r WHERE r.freqReeduc = :freqReeduc")})
public class Reeducation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reeduc")
    private Integer idReeduc;
    @Basic(optional = false)
    @Column(name = "type_reeduc")
    private String typeReeduc;
    @Basic(optional = false)
    @Column(name = "duree_reeduc")
    private String dureeReeduc;
    @Basic(optional = false)
    @Column(name = "freq_reeduc")
    private String freqReeduc;
    @ManyToMany(mappedBy = "reeducationList", fetch = FetchType.LAZY)
    private List<Medecins> medecinsList;
    @ManyToMany(mappedBy = "reeducationList", fetch = FetchType.LAZY)
    private List<Patients> patientsList;

    public Reeducation() {
    }

    public Reeducation(Integer idReeduc) {
        this.idReeduc = idReeduc;
    }

    public Reeducation(Integer idReeduc, String typeReeduc, String dureeReeduc, String freqReeduc) {
        this.idReeduc = idReeduc;
        this.typeReeduc = typeReeduc;
        this.dureeReeduc = dureeReeduc;
        this.freqReeduc = freqReeduc;
    }

    public Integer getIdReeduc() {
        return idReeduc;
    }

    public void setIdReeduc(Integer idReeduc) {
        this.idReeduc = idReeduc;
    }

    public String getTypeReeduc() {
        return typeReeduc;
    }

    public void setTypeReeduc(String typeReeduc) {
        this.typeReeduc = typeReeduc;
    }

    public String getDureeReeduc() {
        return dureeReeduc;
    }

    public void setDureeReeduc(String dureeReeduc) {
        this.dureeReeduc = dureeReeduc;
    }

    public String getFreqReeduc() {
        return freqReeduc;
    }

    public void setFreqReeduc(String freqReeduc) {
        this.freqReeduc = freqReeduc;
    }

    @XmlTransient
    public List<Medecins> getMedecinsList() {
        return medecinsList;
    }

    public void setMedecinsList(List<Medecins> medecinsList) {
        this.medecinsList = medecinsList;
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
        hash += (idReeduc != null ? idReeduc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reeducation)) {
            return false;
        }
        Reeducation other = (Reeducation) object;
        if ((this.idReeduc == null && other.idReeduc != null) || (this.idReeduc != null && !this.idReeduc.equals(other.idReeduc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Reeducation[ idReeduc=" + idReeduc + " ]";
    }
    
}
