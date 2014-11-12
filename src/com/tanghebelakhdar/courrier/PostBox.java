package com.tanghebelakhdar.courrier;

import java.util.ArrayList;

public class PostBox {
	
	protected ArrayList<Letter<?>> courrierAboite;
	
	public PostBox()
	{
		this.courrierAboite= new ArrayList<Letter<?>>();
	}
	 
	/**
	 * permet de rajouter un courrier à la boite de lettre
	 * @param c
	 */
	public void ajoutLettre(Letter<?> c)
	{
		this.courrierAboite.add(c);
	}
	
	/**
	 * permet de récuperer le courrier qui'est à la boite de lettre
	 * @return
	 */
	public ArrayList<Letter<?>> getCourrierAboite()
	{
		return this.courrierAboite;
	}
}
