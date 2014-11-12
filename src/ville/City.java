package ville;
import courrier.Courrier;
import courrier.Inhabitant;
import java.awt.*;
import java.util.ArrayList;

import courrier.Inhabitant;

public class City {
	
	protected String nom;
	protected ArrayList<Inhabitant> habitants;
	protected PostBox boite_lettre;
	protected Courrier<?> courrier;
	
	public City(String nom)
	{
		this.nom=nom;
		this.habitants = new  ArrayList<Inhabitant>();
	}
	
	public void sendLetter()
	{
		this.boite_lettre.ajoutLettre(courrier);
	}
	
	public void distributeLetters()
	{
		if(this.LettersAdistrubute())
		{
			//!!!!!
		}
	}
	/**
	 * permet de savoir si il y'a un courrier à distrubbier
	 */
	public boolean LettersAdistrubute()
	{
		if(!this.boite_lettre.courrierAboite.isEmpty())
			return true;
		return false;
	}

}
