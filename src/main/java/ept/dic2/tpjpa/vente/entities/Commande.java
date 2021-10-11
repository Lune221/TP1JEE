package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@Table(name="commande")
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUMERO")
	private int numero;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_COMMANDE")
	private Date dateCommande;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_LIVRAISON")
	private Date dateLivraison;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_LIVRAISON_VOULUE")
	private Date dateLivraisonVoulue;

	@Column(name="STATUT")
	private byte statut;

	//bi-directional many-to-one association to ArticleCommande
	@OneToMany(mappedBy="commande")
	private List<ArticleCommande> articleCommandes;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="CLIENT_ID")
	private Client client;

	//bi-directional many-to-one association to Magasin
	@ManyToOne
	@JoinColumn(name="MAGASIN_ID")
	private Magasin magasin;

	//bi-directional many-to-one association to Employe
	@ManyToOne
	@JoinColumn(name="VENDEUR_ID")
	private Employe employe;

	public Commande() {
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Date getDateLivraisonVoulue() {
		return this.dateLivraisonVoulue;
	}

	public void setDateLivraisonVoulue(Date dateLivraisonVoulue) {
		this.dateLivraisonVoulue = dateLivraisonVoulue;
	}

	public byte getStatut() {
		return this.statut;
	}

	public void setStatut(byte statut) {
		this.statut = statut;
	}

	public List<ArticleCommande> getArticleCommandes() {
		return this.articleCommandes;
	}

	public void setArticleCommandes(List<ArticleCommande> articleCommandes) {
		this.articleCommandes = articleCommandes;
	}

	public ArticleCommande addArticleCommande(ArticleCommande articleCommande) {
		getArticleCommandes().add(articleCommande);
		articleCommande.setCommande(this);

		return articleCommande;
	}

	public ArticleCommande removeArticleCommande(ArticleCommande articleCommande) {
		getArticleCommandes().remove(articleCommande);
		articleCommande.setCommande(null);

		return articleCommande;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Magasin getMagasin() {
		return this.magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}