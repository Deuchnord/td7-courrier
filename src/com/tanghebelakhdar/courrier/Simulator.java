package com.tanghebelakhdar.courrier;

import java.util.ArrayList;

public class Simulator {
	
	private static final int SIMPLE_LETTER = 0;
	private static final int PROMOSORRY_NOTE = 1;
	private static TextContent TEXT = new TextContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ut placerat diam. Ut vitae dictum arcu. Ut non lacus diam. Praesent maximus luctus ex, ac sodales urna vulputate ac. Sed eget velit blandit, fermentum nisl pulvinar, hendrerit nisl. Curabitur mauris neque, dapibus quis est suscipit, venenatis malesuada nisl. Phasellus non suscipit elit. Duis ultricies lacinia viverra. Mauris sit amet tincidunt massa. Donec auctor eu metus sit amet egestas. Morbi at scelerisque eros. Cras condimentum eleifend blandit. Nam egestas, velit dignissim maximus ultrices, neque neque pellentesque dolor, et cursus justo nibh id quam. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Maecenas dictum, orci in consequat sodales, sapien orci dictum dolor, non imperdiet felis nibh sit amet lorem. Donec ultrices ut mi eu ultricies.");
	private static Money MONEY = new Money(500);
	private static City city;
	private static int nbDays;
	private static int numberInhabitants;
	
	public Simulator(City city, int nbDays, int numberInhabitants)
	{
		this.city=city;
		this.nbDays = nbDays;
		this.numberInhabitants = numberInhabitants;
	}
	
	private static ArrayList<Inhabitant> generateInhabitants(City city, int numberInhabitants) {
		
		ArrayList<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		
		for(int i = 0; i < numberInhabitants; i++)
			inhabitants.add(new Inhabitant("Inhabitant"+(i+1), city, 500));
		
		return inhabitants;
	}
	
	public void DistributeLetterOfDay()
	{
		ArrayList<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		for(int day = 1; day <= nbDays; day++)
		{
			System.out.println("Day n°"+day+". The inhabitants stand up.");
			Letter<Content> letter;
			
			for(int i = 0; i < 4; i++) {
				
				int inhabitantSenderNumber = (int) (Math.random() * numberInhabitants);
				int inhabitantReceiverNumber = (int) (Math.random() * numberInhabitants);
				int typeLetter = (int) (Math.random() * 2);
		
				sendLetter(inhabitants.get(inhabitantSenderNumber), inhabitants.get(inhabitantReceiverNumber), typeLetter);
			
			}
		}
	}
	private static void sendLetter(Inhabitant sender,Inhabitant receiver, int typeLetter) 
	{	
		Letter<?> letter;
		SimpleLetter simple = new SimpleLetter(receiver, receiver, TEXT);
		RegisteredLetter<SimpleLetter> letter1 = new RegisteredLetter<SimpleLetter>(sender,receiver,simple);	
		switch(typeLetter) {
		case SIMPLE_LETTER :
				letter = new SimpleLetter(sender, receiver, TEXT);
				break;
		case PROMOSORRY_NOTE :
			    letter = new PromissoryNote(receiver, receiver, MONEY);
				break;
		default :
			letter = new RegisteredLetter(receiver, receiver, letter1);
				
			}
	}	

	public static void simule()
	{	
		System.out.println("..........the liste of the inhabitants and her bank Account..............");
		Simulator.generateInhabitants(city,numberInhabitants);
		System.out.println();
		System.out.println("-------------Simulator to distribute the letters -------------------------------------");
		System.out.println();
		for (int k = 1 ; k <= nbDays ; k++)
		{
			System.out.println("Mailling letter for"+k+"Days\n");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// If the argument is absent, the program ends now.
		if(args.length == 1) {
			System.out.println("Usage : "+args[0]+" <number_of_days>");
			return;
		}
		System.out.println("Number of days\n");
		int nbDays = Integer.parseInt(args[1]);
		City city = new City("Duisburg");
		Simulator s1 = new Simulator(city,nbDays,100 );
		s1.simule();
		
		
}
	}
