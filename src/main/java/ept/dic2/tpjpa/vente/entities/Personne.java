package ept.dic2.tpjpa.vente.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@MappedSuperclass

public class Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRENOM")
	private String prenom;

	@Column(name="TELEPHONE")
	private String telephone;
	
//	Methods

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   
}
