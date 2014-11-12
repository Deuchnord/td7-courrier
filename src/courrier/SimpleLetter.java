package courrier;

import contenu.Text;

public class SimpleLetter extends Courrier<Text>{
		
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text texte) {
		super(sender, receiver, texte);
	}

	public float getCout()
	{
		return 1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Lettre Simple";
	}
}
