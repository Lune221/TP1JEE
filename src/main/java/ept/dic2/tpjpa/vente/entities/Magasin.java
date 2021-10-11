package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the magasin database table.
 * 
 */
@Entity
@Table(name="magasin")
@NamedQuery(name="Magasin.findAll", query="SELECT m FROM Magasin m")
public class Magasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	
	@Embedded
	@AttributeOverride(name = "adresse", column = @Column(name="ADRESSE"))
	private Adresse adresse;

	@Column(name="CODE_ZIP")
	private String codeZip;

	@Column(name="EMAIL")
	private String email;

	@Column(name="ETAT")
	private String etat;

	@Column(name="NOM")
	private String nom;

	@Column(name="TELEPHONE")
	private String telephone;

	@Column(name="VILLE")
	private String ville;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="magasin")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Employe
	@OneToMany(mappedBy="magasin")
	private List<Employe> employes;

	public Magasin() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getCodeZip() {
		return this.codeZip;
	}

	public void setCodeZip(String codeZip) {
		this.codeZip = codeZip;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setMagasin(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setMagasin(null);

		return commande;
	}

	public List<Employe> getEmployes() {
		return this.employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public Employe addEmploye(Employe employe) {
		getEmployes().add(employe);
		employe.setMagasin(this);

		return employe;
	}

	public Employe removeEmploye(Employe employe) {
		getEmployes().remove(employe);
		employe.setMagasin(null);

		return employe;
	}

}