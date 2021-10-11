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
@Singleton(mappedName = "listemployeonstartup")
@Startup
public class ListEmployeOnStartUp {

	@EJB
	GenericBeanFacadeEmploye employeBeanFacade;
	
    /**
     * Default constructor. 
     */
    public ListEmployeOnStartUp() {
        System.out.println("############## List Employes On StartUp ##################");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("############ AFTER CONSTRUCT ##############");
        ArrayList<Employe> employes = new ArrayList<Employe>();
        employes = employeBeanFacade.findAll();
        
        for (Iterator iterator = employes.iterator(); iterator.hasNext();) {
			Employe employe = (Employe) iterator.next();
			System.out.println(employe.getPrenom());
		}
    }

}
