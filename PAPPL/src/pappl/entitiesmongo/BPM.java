/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entitiesmongo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;

/**
 *
 * @author oualidcheriaf
 */
@Entity
@Embeddable
@NoSql(dataFormat=DataFormatType.MAPPED)
public class BPM implements Serializable {

    @Basic 
    @Id
    @Field(name="date")
    String date;
    @Basic
    float valeur;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
    
    
    @Override
    public boolean equals(Object object) {
        return false;
        // TODO: Warning - this method won't work in the case the id fields are not set
    }

    @Override
    public String toString() {
        return "pappl.entities.Temperature[ id=  ]";
    }
    
}
