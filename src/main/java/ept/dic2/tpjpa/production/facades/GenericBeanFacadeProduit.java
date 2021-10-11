package ept.dic2.tpjpa.production.facades;

import java.util.ArrayList;

import javax.ejb.Remote;

import ept.dic2.tpjpa.production.entities.Produit;

@Remote
public interface GenericBeanFacadeProduit{
	
	public ArrayList<Produit> findAll();
	
	public Produit findOne(Produit element);
	
	public boolean deleteOne(Produit element);
	
	public boolean updateOne(Produit element);
}
