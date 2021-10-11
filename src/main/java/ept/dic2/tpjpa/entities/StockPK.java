package ept.dic2.tpjpa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the stock database table.
 * 
 */
@Embeddable
public class StockPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MAGASIN_ID")
	private int magasinId;

	@Column(name="PRODUIT_ID", insertable=false, updatable=false)
	private int produitId;

	public StockPK() {
	}
	public int getMagasinId() {
		return this.magasinId;
	}
	public void setMagasinId(int magasinId) {
		this.magasinId = magasinId;
	}
	public int getProduitId() {
		return this.produitId;
	}
	public void setProduitId(int produitId) {
		this.produitId = produitId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StockPK)) {
			return false;
		}
		StockPK castOther = (StockPK)other;
		return 
			(this.magasinId == castOther.magasinId)
			&& (this.produitId == castOther.produitId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.magasinId;
		hash = hash * prime + this.produitId;
		
		return hash;
	}
}