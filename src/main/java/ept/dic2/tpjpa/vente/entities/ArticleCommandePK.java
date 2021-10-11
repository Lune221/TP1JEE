package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the article_commande database table.
 * 
 */
@Embeddable
public class ArticleCommandePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NUMERO_COMMANDE", insertable=false, updatable=false)
	private int numeroCommande;

	@Column(name="LIGNE")
	private int ligne;

	public ArticleCommandePK() {
	}
	public int getNumeroCommande() {
		return this.numeroCommande;
	}
	public void setNumeroCommande(int numeroCommande) {
		this.numeroCommande = numeroCommande;
	}
	public int getLigne() {
		return this.ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ArticleCommandePK)) {
			return false;
		}
		ArticleCommandePK castOther = (ArticleCommandePK)other;
		return 
			(this.numeroCommande == castOther.numeroCommande)
			&& (this.ligne == castOther.ligne);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroCommande;
		hash = hash * prime + this.ligne;
		
		return hash;
	}
}