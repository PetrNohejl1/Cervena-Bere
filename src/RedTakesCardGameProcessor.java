

public class RedTakesCardGameProcessor implements CardGameProcessor {


	public int evaluate(Card card1, Card card2) {
	
		//ani jedna cervena
		
		if (!card1.getColor().equals(Card.COLOR_RED) && !card2.getColor().equals(Card.COLOR_RED)) {
			System.out.println("Ani jedna karta cervena");
			return 0;
		}
		//karta 1 cervena
		
		if (card1.getColor().equals(Card.COLOR_RED)) {
			//karta 2 cervena
		
			if (card2.getColor().equals(Card.COLOR_RED)) {
				if (card1.getValue() > card2.getValue()) {
					System.out.println("Karta 1 cervena, Karta 2 cervena - 1. vetsi");
					return -1;
				} else {
					System.out.println("Karta 1 cervena, Karta 2 cervena - 2. vetsi");
					return +1;
				}
			}
			//karta 2 necervena
			
			
			else {
				System.out.println("Karta 1 cervena, Karta 2 necervena");
				return -1;
			}
		}
		//karta 1 necervena a karta 2 cervena
		
		else {
			System.out.println("Karta 1 necervena, Karta 2 cervena");
			return +1;
		}

	}

}