package ept.dic2.tpjpa.production.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@Table(name="produit")
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="ANNEE_MODEL")
	private short anneeModel;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRIX_DEPART")
	private BigDecimal prixDepart;

	//bi-directional many-to-one association to Categorie
	@ManyToOne
	@JoinColumn(name="CATEGORIE_ID")
	private Categorie categorie;

	//bi-directional many-to-one association to Marque
	@ManyToOne
	@JoinColumn(name="MARQUE_ID")
	private Marque marque;

	//bi-directional many-to-one association to Stock
	@OneToMany(mappedBy="produit")
	private List<Stock> stocks;

	public Produit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAnneeModel() {
		return this.anneeModel;
	}

	public void setAnneeModel(short anneeModel) {
		this.anneeModel = anneeModel;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BigDecimal getPrixDepart() {
		return this.prixDepart;
	}

	public void setPrixDepart(BigDecimal prixDepart) {
		this.prixDepart = prixDepart;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Marque getMarque() {
		return this.marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setProduit(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setProduit(null);

		return stock;
	}

}