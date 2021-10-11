package ept.dic2.tpjpa.production.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the marque database table.
 * 
 */
@Entity
@Table(name="marque")
@NamedQuery(name="Marque.findAll", query="SELECT m FROM Marque m")
public class Marque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="NOM")
	private String nom;

	//bi-directional many-to-one association to Produit
	@OneToMany(mappedBy="marque")
	private List<Produit> produits;

	public Marque() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Produit addProduit(Produit produit) {
		getProduits().add(produit);
		produit.setMarque(this);

		return produit;
	}

	public Produit removeProduit(Produit produit) {
		getProduits().remove(produit);
		produit.setMarque(null);

		return produit;
	}

}