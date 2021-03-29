package be.thomasmore.eigenapplicatie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private int id;
    private String soortName;
    private String merkName;
    private int jaar;
    private int vermogen;
    private int prijs;
    private String brandstof;
    private boolean automatisch;
    private boolean specialLine;

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoortName() {
        return soortName;
    }

    public void setSoortName(String soortName) {
        this.soortName = soortName;
    }

    public String getMerkName() {
        return merkName;
    }

    public void setMerkName(String merkName) {
        this.merkName = merkName;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public int getVermogen() {
        return vermogen;
    }

    public void setVermogen(int vermogen) {
        this.vermogen = vermogen;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    public boolean isAutomatisch() {
        return automatisch;
    }

    public void setAutomatisch(boolean automatisch) {
        this.automatisch = automatisch;
    }

    public boolean isSpecialLine() {
        return specialLine;
    }

    public void setSpecialLine(boolean specialLine) {
        this.specialLine = specialLine;
    }
}
