package ept.dic2.tpjpa.production.facades;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ept.dic2.tpjpa.production.entities.Produit;

/**
 * Session Bean implementation class ProduitSessionBeanFacade
 */
@Stateless(mappedName = "EJB3-SessionEJB")
public class ProduitSessionBeanFacade implements GenericBeanFacadeProduit {

    /**
     * Default constructor. 
     */
    public ProduitSessionBeanFacade() {
    }
    
    @PersistenceContext(unitName = "TPJPAWEB-production")
    EntityManager entityManager;

	@Override
	public ArrayList<Produit> findAll() {
		ArrayList<Produit> produits = new ArrayList<Produit>();
		Query query = entityManager.createNamedQuery("Produit.findAll");
		
		try {
			produits = (ArrayList<Produit>) query.getResultList();
		} catch (Exception e) {
			System.out.println("ERROR WHILE GETTING THE PRODUITS LIST: " + e.getMessage());
		}
		
		return produits;
	}

	@Override
	public Produit findOne(Produit element) {
		return null;
	}

	@Override
	public boolean deleteOne(Produit element) {
		return false;
	}

	@Override
	public boolean updateOne(Produit element) {
		return false;
	}
    
    

}
