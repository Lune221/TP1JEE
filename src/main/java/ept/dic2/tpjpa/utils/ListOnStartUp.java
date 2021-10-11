package ept.dic2.tpjpa.utils;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import ept.dic2.tpjpa.entities.Produit;
import ept.dic2.tpjpa.facades.GenericBeanFacadeProduit;
import ept.dic2.tpjpa.facades.ProduitSessionBeanFacade;

/**
 * Session Bean implementation class ListOnStartUp
 */
@Singleton(mappedName = "listonstartup")
@Startup
public class ListOnStartUp {
	
	@EJB
	GenericBeanFacadeProduit beanFacade;
    /**
     * Default constructor. 
     */
    public ListOnStartUp() {
        System.out.println("############## ListOnStartUp ##################");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("############ AFTER CONSTRUCT ##############");
    	ArrayList<Produit> produits = new ArrayList<Produit>();
        produits = beanFacade.findAll();
        for (Iterator iterator = produits.iterator(); iterator.hasNext();) {
			Produit produit = (Produit) iterator.next();
			System.out.println(produit.getNom());
		}
    }

}
