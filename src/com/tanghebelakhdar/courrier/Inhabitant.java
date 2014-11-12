package com.tanghebelakhdar.courrier;

public class Inhabitant {
	protected String nom;
	protected City ville;
	protected float soldeCompte;
	
	public Inhabitant(String nom,City ville, float soldeCompte)
	{
		this.nom=nom;
		this.ville=ville;
		this.soldeCompte=soldeCompte;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	public float getSoldeCompte()
	{
		return this.soldeCompte;
	}
	
	public void credit(float montant)
	{
		this.soldeCompte = this.soldeCompte + montant;
	}
	
	public void debite(float montant)
	{
		this.soldeCompte = this.soldeCompte - montant;
	}
	
	public void receiveLetter(Letter<?> c)
	{
		System.out.println(c.toString()+"reçois par"+this.nom);
		//!!!!!
	}
	
	public void sendLetter(Letter<?> c)
	{
		System.out.println("Envoie"+c.toString()+"de"+this.nom+"vers"+c.receiver.nom);
	}
}
