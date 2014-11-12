package courrier;

import contenu.Contenu;
 
public abstract class Courrier <C extends Contenu> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected float cout;
	protected Contenu c;
	
	public Courrier(Inhabitant sender,Inhabitant receiver, Contenu c)
	{
		this.cout = 0;
		this.sender=sender;
		this.receiver=receiver;
		this.c = c;
	}

	public abstract float getCout();
	
	public abstract String toString();
	
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	public Contenu getC()
	{
		return this.c;
	}
}
