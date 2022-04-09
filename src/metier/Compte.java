package metier;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
	private Long code;
    private double solde;
    @XmlTransient//Pour ignorer l'attribut date de creation
    private Date dateCreation;
    public Compte(Long code, double solde, Date dateCreation){
        this.code=code;
        this.dateCreation=dateCreation;
        this.solde=solde;
    }
    public Compte(){

    }

    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

}
