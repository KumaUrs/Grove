/**
 * 
 */
import PlayerDeck.DeckController;
/**
 * @author rfjax
 *
 */
public class EntryGrove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeckController playerDeck = new DeckController();
		
		playerDeck.displayHand();
		playerDeck.discardCard(playerDeck.getPlayerHand().get(0), (byte) 0);
		
		System.out.println();
		playerDeck.displayHand();
		System.out.println();
		
		
		playerDeck.displayGraveyard();

	}

}
