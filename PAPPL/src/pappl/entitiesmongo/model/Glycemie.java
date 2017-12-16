/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pappl.entitiesmongo.model;

import java.io.Serializable;

/**
 * @author oualidcheriaf
 */

public class Glycemie implements Serializable, Mesurable {
    private String date;
    private Double valeur;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public double getValeurDouble() {
        return (double) valeur;
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
