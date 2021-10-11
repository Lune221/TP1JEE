package ept.dic2.tpjpa.vente.entities;

import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employe database table.
 * 
 */
@Entity
@Table(name="employe")
@NamedQuery(name="Employe.findAll", query="SELECT e FROM Employe e")
public class Employe extends Personne {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIF")
	private byte actif;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="employe")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Magasin
	@ManyToOne
	@JoinColumn(name="MAGASIN_ID")
	private Magasin magasin;

	//bi-directional many-to-one association to Employe
	@ManyToOne
	@JoinColumn(name="MANAGER_ID")
	private Employe employe;

	//bi-directional many-to-one association to Employe
	@OneToMany(mappedBy="employe")
	private List<Employe> employes;

	public Employe() {
	}

	public byte getActif() {
		return this.actif;
	}

	public void setActif(byte actif) {
		this.actif = actif;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setEmploye(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setEmploye(null);

		return commande;
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

	public List<Employe> getEmployes() {
		return this.employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public Employe addEmploye(Employe employe) {
		getEmployes().add(employe);
		employe.setEmploye(this);

		return employe;
	}

	public Employe removeEmploye(Employe employe) {
		getEmployes().remove(employe);
		employe.setEmploye(null);

		return employe;
	}

}