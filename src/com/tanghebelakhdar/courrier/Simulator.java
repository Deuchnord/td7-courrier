package com.tanghebelakhdar.courrier;

import java.util.ArrayList;

public class Simulator {
	
	private static int SIMPLE_LETTER = 0,
			PROMOSORRY_NOTE = 0;
	private static TextContent TEXT = new TextContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ut placerat diam. Ut vitae dictum arcu. Ut non lacus diam. Praesent maximus luctus ex, ac sodales urna vulputate ac. Sed eget velit blandit, fermentum nisl pulvinar, hendrerit nisl. Curabitur mauris neque, dapibus quis est suscipit, venenatis malesuada nisl. Phasellus non suscipit elit. Duis ultricies lacinia viverra. Mauris sit amet tincidunt massa. Donec auctor eu metus sit amet egestas. Morbi at scelerisque eros. Cras condimentum eleifend blandit. Nam egestas, velit dignissim maximus ultrices, neque neque pellentesque dolor, et cursus justo nibh id quam. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Maecenas dictum, orci in consequat sodales, sapien orci dictum dolor, non imperdiet felis nibh sit amet lorem. Donec ultrices ut mi eu ultricies.");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// If the argument is absent, the program ends now.
		if(args.length == 1) {
			
			System.out.println("Usage : "+args[0]+" <number_of_days>");
			return;
			
		}
		
		int numberInhabitants = 100;
		
		City city = new City("Duisburg");
		ArrayList<Inhabitant> inhabitants = generateInhabitants(city, numberInhabitants);
		
		int nbDays = Integer.parseInt(args[1]);
		
		for(int day = 1; day <= nbDays; day++) {
			
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
	
	private static void sendLetter(Inhabitant sender,
			Inhabitant receiver, int typeLetter) {
		
		Letter<?> letter;
		
		switch(typeLetter) {
		
		case SIMPLE_LETTER:
			letter = new SimpleLetter(sender, receiver, TEXT);
			break;
			
			
		}
		
	}

	private static ArrayList<Inhabitant> generateInhabitants(City city, int number) {
		
		ArrayList<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		
		for(int i = 0; i < number; i++)
			inhabitants.add(new Inhabitant("Inhabitant"+(i+1), city, 500));
		
		return inhabitants;
		
	}

}
