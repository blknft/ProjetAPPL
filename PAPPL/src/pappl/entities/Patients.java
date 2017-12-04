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
@Table(name = "patients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p")
    , @NamedQuery(name = "Patients.findByIdPatients", query = "SELECT p FROM Patients p WHERE p.idPatients = :idPatients")
    , @NamedQuery(name = "Patients.findByNomPatients", query = "SELECT p FROM Patients p WHERE p.nomPatients = :nomPatients")
    , @NamedQuery(name = "Patients.findBySexe", query = "SELECT p FROM Patients p WHERE p.sexe = :sexe")
    , @NamedQuery(name = "Patients.findByPrenomPatients", query = "SELECT p FROM Patients p WHERE p.prenomPatients = :prenomPatients")
    , @NamedQuery(name = "Patients.findByAgePatients", query = "SELECT p FROM Patients p WHERE p.agePatients = :agePatients")
    , @NamedQuery(name = "Patients.findByTaille", query = "SELECT p FROM Patients p WHERE p.taille = :taille")
    , @NamedQuery(name = "Patients.findByPoids", query = "SELECT p FROM Patients p WHERE p.poids = :poids")
    , @NamedQuery(name = "Patients.findByFumeur", query = "SELECT p FROM Patients p WHERE p.fumeur = :fumeur")
    , @NamedQuery(name = "Patients.findByTelPatients", query = "SELECT p FROM Patients p WHERE p.telPatients = :telPatients")
    , @NamedQuery(name = "Patients.findByAdressePatients", query = "SELECT p FROM Patients p WHERE p.adressePatients = :adressePatients")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_patients")
    private Integer idPatients;
    @Basic(optional = false)
    @Column(name = "nom_patients")
    private String nomPatients;
    @Basic(optional = false)
    @Column(name = "sexe")
    private String sexe;
    @Basic(optional = false)
    @Column(name = "prenom_patients")
    private String prenomPatients;
    @Basic(optional = false)
    @Column(name = "age_patients")
    private int agePatients;
    @Basic(optional = false)
    @Column(name = "taille")
    private int taille;
    @Basic(optional = false)
    @Column(name = "poids")
    private int poids;
    @Basic(optional = false)
    @Column(name = "fumeur")
    private boolean fumeur;
    @Basic(optional = false)
    @Column(name = "tel_patients")
    private int telPatients;
    @Basic(optional = false)
    @Column(name = "adresse_patients")
    private String adressePatients;
    @ManyToMany(mappedBy = "patientsList", fetch = FetchType.LAZY)
    private List<Allergies> allergiesList;
    @ManyToMany(mappedBy = "patientsList", fetch = FetchType.LAZY)
    private List<Medicaments> medicamentsList;
    @JoinTable(name = "fait", joinColumns = {
        @JoinColumn(name = "id_patients", referencedColumnName = "id_patients")}, inverseJoinColumns = {
        @JoinColumn(name = "id_reeduc", referencedColumnName = "id_reeduc")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Reeducation> reeducationList;
    @ManyToMany(mappedBy = "patientsList", fetch = FetchType.LAZY)
    private List<Pathologies> pathologiesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients", fetch = FetchType.LAZY)
    private List<EnContactAvec> enContactAvecList;

    public Patients() {
    }

    public Patients(Integer idPatients) {
        this.idPatients = idPatients;
    }

    public Patients(Integer idPatients, String nomPatients, String sexe, String prenomPatients, int agePatients, int taille, int poids, boolean fumeur, int telPatients, String adressePatients) {
        this.idPatients = idPatients;
        this.nomPatients = nomPatients;
        this.sexe = sexe;
        this.prenomPatients = prenomPatients;
        this.agePatients = agePatients;
        this.taille = taille;
        this.poids = poids;
        this.fumeur = fumeur;
        this.telPatients = telPatients;
        this.adressePatients = adressePatients;
    }

    public Integer getIdPatients() {
        return idPatients;
    }

    public void setIdPatients(Integer idPatients) {
        this.idPatients = idPatients;
    }

    public String getNomPatients() {
        return nomPatients;
    }

    public void setNomPatients(String nomPatients) {
        this.nomPatients = nomPatients;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPrenomPatients() {
        return prenomPatients;
    }

    public void setPrenomPatients(String prenomPatients) {
        this.prenomPatients = prenomPatients;
    }

    public int getAgePatients() {
        return agePatients;
    }

    public void setAgePatients(int agePatients) {
        this.agePatients = agePatients;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public boolean getFumeur() {
        return fumeur;
    }

    public void setFumeur(boolean fumeur) {
        this.fumeur = fumeur;
    }

    public int getTelPatients() {
        return telPatients;
    }

    public void setTelPatients(int telPatients) {
        this.telPatients = telPatients;
    }

    public String getAdressePatients() {
        return adressePatients;
    }

    public void setAdressePatients(String adressePatients) {
        this.adressePatients = adressePatients;
    }

    @XmlTransient
    public List<Allergies> getAllergiesList() {
        return allergiesList;
    }

    public void setAllergiesList(List<Allergies> allergiesList) {
        this.allergiesList = allergiesList;
    }

    @XmlTransient
    public List<Medicaments> getMedicamentsList() {
        return medicamentsList;
    }

    public void setMedicamentsList(List<Medicaments> medicamentsList) {
        this.medicamentsList = medicamentsList;
    }

    @XmlTransient
    public List<Reeducation> getReeducationList() {
        return reeducationList;
    }

    public void setReeducationList(List<Reeducation> reeducationList) {
        this.reeducationList = reeducationList;
    }

    @XmlTransient
    public List<Pathologies> getPathologiesList() {
        return pathologiesList;
    }

    public void setPathologiesList(List<Pathologies> pathologiesList) {
        this.pathologiesList = pathologiesList;
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
        hash += (idPatients != null ? idPatients.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.idPatients == null && other.idPatients != null) || (this.idPatients != null && !this.idPatients.equals(other.idPatients))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.Patients[ idPatients=" + idPatients + " ]";
    }
    
}
