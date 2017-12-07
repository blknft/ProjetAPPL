/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entitiesmongo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;
/**
 *
 * @author oualidcheriaf
 */
@Entity
@NoSql(dataFormat=DataFormatType.MAPPED,dataType="pat")
public class jeuDeDonnees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Field(name="_id")
    private Integer id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Field(name="ID")
    private Integer ID;
    @Basic 
    private String Prenom;
    @Basic
    private String Nom;
    @Basic
    private String Adresse;
    @ElementCollection
    private List<Temperature> Temperature = new ArrayList<Temperature>();
    @ElementCollection
    private List<Tension> Tension = new ArrayList<Tension>();
    @ElementCollection
    private List<Glycemie> Glycemie = new ArrayList<Glycemie>();
    @Basic
    private String date;
@ElementCollection
    private List<BPM> BPM = new ArrayList<BPM>();

    public List<BPM> getBPM() {
        return BPM;
    }

    public void setBPM(List<BPM> BPM) {
        this.BPM = BPM;
    }
    public List<Tension> getTension() {
        return Tension;
    }

    public void setTension(List<Tension> Tension) {
        this.Tension = Tension;
    }

    public List<Glycemie> getGlycemie() {
        return Glycemie;
    }

    public void setGlycemie(List<Glycemie> Glycemie) {
        this.Glycemie = Glycemie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public List<Temperature> getTemperature() {
        return Temperature;
    }

    public void setTemperature(List<Temperature> Temperature) {
        this.Temperature = Temperature;
    }
    
    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof jeuDeDonnees)) {
            return false;
        }
        jeuDeDonnees other = (jeuDeDonnees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pappl.entities.PatientMongo[ id=" + id + " ]";
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
}
