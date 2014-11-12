package com.tanghebelakhdar.courrier;

public class PromissoryNote extends Letter<Money> {
	
	protected Money somme;
	protected Remerciement lettre;
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money somme) 
	{
		super(sender, receiver, somme);
	}
	
	/*public Inhabitant getReceiver()
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
	 *
	public void viremment(float somme)
	{
		this.receiver.credit(somme);
	}
	
	public float getCout()
	{
		return (1+(this.somme.getMontant() / 100));
	}
	public String MessegaeRemerciement(String msg)
	{
		return lettre.toString();
		
	}*/

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void action() {
		this.getReceiver().credit(somme);
		this.getReceiver().postLetter();
		this
		
	}

}
