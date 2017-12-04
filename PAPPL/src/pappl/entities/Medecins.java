/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author oualidcheriaf
 */
@Entity
@Table(name = "medecins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecins.findAll", query = "SELECT m FROM Medecins m")
    , @NamedQuery(name = "Medecins.findByIdMedecins", query = "SELECT m FROM Medecins m WHERE m.idMedecins = :idMedecins")
    , @NamedQuery(name = "Medecins.findByNomMedecins", query = "SELECT m FROM Medecins m WHERE m.nomMedecins = :nomMedecins")
    , @NamedQuery(name = "Medecins.findByPrenomMedecins", query = "SELECT m FROM Medecins m WHERE m.prenomMedecins = :prenomMedecins")
    , @NamedQuery(name = "Medecins.findBySexeMedecins", query = "SELECT m FROM Medecins m WHERE m.sexeMedecins = :sexeMedecins")
    , @NamedQuery(name = "Medecins.findByAdresseMedecins", query = "SELECT m FROM Medecins m WHERE m.adresseMedecins = :adresseMedecins")
    , @NamedQuery(name = "Medecins.findByTelMedecins", query = "SELECT m FROM Medecins m WHERE m.telMedecins = :telMedecins")
    , @NamedQuery(name = "Medecins.findBySpecialite", query = "SELECT m FROM Medecins m WHERE m.specialite = :specialite")})
public class Medecins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_medecins")
    private Integer idMedecins;
    @Basic(optional = false)
    @Column(name = "nom_medecins")
    private String nomMedecins;
    @Basic(optional = false)
    @Column(name = "prenom_medecins")
    private String prenomMedecins;
    @Basic(optional = false)
    @Column(name = "sexe_medecins")
    private String sexeMedecins;
    @Basic(optional = false)
    @Column(name = "adresse_medecins")
    private String adresseMedecins;
    @Basic(optional = false)
    @Column(name = "tel_medecins")
    private int telMedecins;
    @Basic(optional = false)
    @Column(name = "specialite")
    private String specialite;
    @JoinTable(name = "fait_par", joinColumns = {
        @JoinColumn(name = "id_medecins", referencedColumnName = "id_medecins")}, inverseJoinColumns = {
        @JoinColumn(name = "id_reeduc", referencedColumnName = "id_reeduc")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Reeducation> reeducationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medecins", fetch = FetchType.LAZY)
    private List<EnContactAvec> enContactAvecList;

    public Medecins() {
    }

    public Medecins(Integer idMedecins) {
        this.idMedecins = idMedecins;
    }

    public Medecins(Integer idMedecins, String nomMedecins, String prenomMedecins, String sexeMedecins, String adresseMedecins, int telMedecins, String specialite) {
        this.idMedecins = idMedecins;
        this.nomMedecins = nomMedecins;
        this.prenomMedecins = prenomMedecins;
        this.sexeMedecins = sexeMedecins;
        this.adresseMedecins = adresseMedecins;
        this.telMedecins = telMedecins;
        this.specialite = specialite;
    }

    public Integer getIdMedecins() {
        return idMedecins;
    }

    public void setIdMedecins(Integer idMedecins) {
        this.idMedecins = idMedecins;
    }

    public String getNomMedecins() {
        return nomMedecins;
    }

    public void setNomMedecins(String nomMedecins) {
        this.nomMedecins = nomMedecins;
    }

    public String getPrenomMedecins() {
        return prenomMedecins;
    }

    public void setPrenomMedecins(String prenomMedecins) {
        this.prenomMedecins = prenomMedecins;
    }

    public String getSexeMedecins() {
        return sexeMedecins;
    }

    public void setSexeMedecins(String sexeMedecins) {
        this.sexeMedecins = sexeMedecins;
    }

    public String getAdresseMedecins() {
        return adresseMedecins;
    }

    public void setAdresseMedecins(String adresseMedecins) {
        this.adresseMedecins = adresseMedecins;
    }

    public int getTelMedecins() {
        return telMedecins;
    }

    public void setTelMedecins(int telMedecins) {
        this.telMedecins = telMedecins;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @XmlTransient
    public List<Reeducation> getReeducationList() {
        return reeducationList;
    }

    public void setReeducationList(List<Reeducation> reeducationList) {
        this.reeducationList = reeducationList;
    }

    @XmlTransient
    public List<EnContactAvec> getEnContactAvecList() {
        return enContactAvecList;
    }

    public void setEnContactAvecList(List<EnContactAvec> enContactAvecList) {
        this.enContactAvecList = enContactAvecList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedecins != null ? idMedecins.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecins)) {
            return false;
        }
        Medecins other = (Medecins) object;
        if ((this.idMedecins == null && other.idMedecins != null) || (this.idMedecins != null && !this.idMedecins.equals(other.idMedecins))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Medecins[ idMedecins=" + idMedecins + " + nomMedecins= "+nomMedecins+" ]";
    }
    
}
