package ept.dic2.tpjpa.vente.facades;

import java.util.ArrayList;

import javax.ejb.Remote;

import ept.dic2.tpjpa.production.entities.Produit;
import ept.dic2.tpjpa.vente.entities.Employe;

@Remote
public interface GenericBeanFacadeEmploye{
	
	public ArrayList<Employe> findAll();
	
	public Employe findOne(Employe element);
	
	public boolean deleteOne(Employe element);
	
	public boolean updateOne(Employe element);
}
