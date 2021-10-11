package ept.dic2.tpjpa.utils;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import ept.dic2.tpjpa.production.entities.Produit;
import ept.dic2.tpjpa.production.facades.GenericBeanFacadeProduit;
import ept.dic2.tpjpa.production.facades.ProduitSessionBeanFacade;
import ept.dic2.tpjpa.vente.entities.Employe;
import ept.dic2.tpjpa.vente.facades.GenericBeanFacadeEmploye;

/**
 * Session Bean implementation class ListOnStartUp
 */
@Singleton(mappedName = "listproduitonstartup")
@Startup
public class ListProduitOnStartUp {
	
	@EJB
	GenericBeanFacadeProduit produitBeanFacade;

    /**
     * Default constructor. 
     */
    public ListProduitOnStartUp() {
        System.out.println("############## List Produits On StartUp ##################");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("############ AFTER CONSTRUCT ##############");
    	ArrayList<Produit> produits = new ArrayList<Produit>();
        produits = produitBeanFacade.findAll();
        for (Iterator iterator = produits.iterator(); iterator.hasNext();) {
			Produit produit = (Produit) iterator.next();
//			System.out.println(produit.getNom());
		}
    }

}
