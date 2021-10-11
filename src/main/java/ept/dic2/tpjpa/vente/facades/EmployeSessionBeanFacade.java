package ept.dic2.tpjpa.vente.facades;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ept.dic2.tpjpa.production.entities.Produit;
import ept.dic2.tpjpa.vente.entities.Employe;

/**
 * Session Bean implementation class ProduitSessionBeanFacade
 */
@Stateless(mappedName = "EJB3-SessionEJB")
public class EmployeSessionBeanFacade implements GenericBeanFacadeEmploye {

    /**
     * Default constructor. 
     */
    public EmployeSessionBeanFacade() {
    }
    
    @PersistenceContext(unitName = "TPJPAWEB-vente")
    EntityManager entityManager;

	@Override
	public ArrayList<Employe> findAll() {
		ArrayList<Employe> produits = new ArrayList<Employe>();
		Query query = entityManager.createNamedQuery("Employe.findAll");
		
		try {
			produits = (ArrayList<Employe>) query.getResultList();
		} catch (Exception e) {
			System.out.println("ERROR WHILE GETTING THE PRODUITS LIST: " + e.getMessage());
		}
		
		return produits;
	}

	@Override
	public Employe findOne(Employe element) {
		return null;
	}

	@Override
	public boolean deleteOne(Employe element) {
		return false;
	}

	@Override
	public boolean updateOne(Employe element) {
		return false;
	}
    
    

}
