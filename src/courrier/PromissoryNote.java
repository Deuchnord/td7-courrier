package courrier;
import contenu.Mony;

public class PromissoryNote extends Courrier<Mony> {
	
	protected Mony somme;
	protected Remerciement lettre;
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Mony somme) 
	{
		super(sender, receiver, somme);
	}
	
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	public Inhabitant getSender()
	{
		return this.sender;
	}
	/**
	 * permet de verser une somme au compte du destinataire
	 * @param somme
	 */
	public void viremment(float somme)
	{
		this.receiver.credit(somme);
	}
	
	public float getCout()
	{
		return (1+(this.somme.getMontant() / 100));
	}
	 /**
	  * pour le message de remerciement
	  * @param msg
	  * @return
	  */
	public String MessegaeRemerciement(String msg)
	{
		return lettre.toString();
		
	}

	@Override
	public String toString() {
		return "Lettre de Change";
	}

}
