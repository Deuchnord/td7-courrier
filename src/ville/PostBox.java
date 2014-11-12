package ville;

import java.util.ArrayList;

import courrier.Courrier;

public class PostBox {
	
	protected ArrayList<Courrier<?>> courrierAboite;
	
	public PostBox()
	{
		this.courrierAboite= new ArrayList<Courrier<?>>();
	}
	 
	/**
	 * permet de rajouter un courrier à la boite de lettre
	 * @param c
	 */
	public void ajoutLettre(Courrier<?> c)
	{
		this.courrierAboite.add(c);
	}
	
	/**
	 * permet de récuperer le courrier qui'est à la boite de lettre
	 * @return
	 */
	public ArrayList<Courrier<?>> getCourrierAboite()
	{
		return this.courrierAboite;
	}
}
