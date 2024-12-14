package com.dao;

import com.model.Prodotti;

public interface ProdottiDao {

	public void save(Prodotti p);
	
	public void update(Prodotti p);
	
	public void delete(int internalCode);
	
	public void findByInternalCode(int internalCode);

	public void findByCode(int code);

}
