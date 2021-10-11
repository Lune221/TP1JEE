package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adresses
 *
 */
@Embeddable
public class Adresse implements Serializable {


	public Adresse() {
		super();
	}
	
	private String adresse;
	
	
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	private static final long serialVersionUID = 1L;

   
}
