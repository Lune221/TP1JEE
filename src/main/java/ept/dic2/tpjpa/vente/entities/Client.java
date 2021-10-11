package ept.dic2.tpjpa.vente.entities;

import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client extends Personne {
	private static final long serialVersionUID = 1L;

	@Embedded
	@AttributeOverride(name="adresse", column = @Column(name="ADRESSE"))
	private Adresse adresse;

	@Column(name="CODE_ZIP")
	private String codeZip;


	@Column(name="ETAT")
	private String etat;

	@Column(name="VILLE")
	private String ville;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="client")
	private List<Commande> commandes;

	public Client() {
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

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
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
		commande.setClient(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setClient(null);

		return commande;
	}

}