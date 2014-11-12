package com.tanghebelakhdar.courrier;

public class SimpleLetter extends Letter<Text>{
		
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
