package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the article_commande database table.
 * 
 */
@Entity
@Table(name="article_commande")
@NamedQuery(name="ArticleCommande.findAll", query="SELECT a FROM ArticleCommande a")
public class ArticleCommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ArticleCommandePK id;

	@Column(name="PRIX_DEPART")
	private BigDecimal prixDepart;

	@Column(name="PRODUIT_ID")
	private int produitId;

	@Column(name="QUANTITE")
	private int quantite;

	@Column(name="REMISE")
	private BigDecimal remise;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="NUMERO_COMMANDE", referencedColumnName = "NUMERO", insertable=false, updatable=false)
	private Commande commande;

	public ArticleCommande() {
	}

	public ArticleCommandePK getId() {
		return this.id;
	}

	public void setId(ArticleCommandePK id) {
		this.id = id;
	}

	public BigDecimal getPrixDepart() {
		return this.prixDepart;
	}

	public void setPrixDepart(BigDecimal prixDepart) {
		this.prixDepart = prixDepart;
	}

	public int getProduitId() {
		return this.produitId;
	}

	public void setProduitId(int produitId) {
		this.produitId = produitId;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public BigDecimal getRemise() {
		return this.remise;
	}

	public void setRemise(BigDecimal remise) {
		this.remise = remise;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}