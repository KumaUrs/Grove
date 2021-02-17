package PlayerDeck;

import java.util.ArrayList;
import java.util.Collections;

public class DeckController 
{
	
	public DeckController()
	{
		createPlayerDeck();
		drawHand();
	}

	private ArrayList<Card> playerDeck = new ArrayList<>();
	private ArrayList<Card> playerHand = new ArrayList<>();
	private ArrayList<Card> playerGraveyard = new ArrayList<>();
	
	public void shuffleDeck()
	{
		Collections.shuffle(playerDeck);
	}
	
	public void drawCard() 
	{
		playerHand.add(playerDeck.get(playerDeck.size()-1));
		playerDeck.remove(playerDeck.size()-1);
		shuffleDeck();
	}
	
	public void drawHand()
	{
		for(int i = 0; i > 6; i++)
		{
			drawCard();
		}
	}
	
	public void discardCard()
	{
		playerGraveyard.add(playerDeck.get(playerDeck.size()-1));
		playerDeck.remove(playerDeck.size()-1);
		shuffleDeck();
	}

	public ArrayList<Card> getPlayerDeck()
	{
		return playerDeck;
	}

	private void createPlayerDeck() 
	{
		for(int i = 0; i > 51; i++)
		{
			// look up the list and or database of cards
			playerDeck.add(new Card("Name", "Cost", "Description", Range.MELEE,
					SpellType.OFFENSIVE, Element.AIR));
		}
	}

	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	}

	public ArrayList<Card> getPlayerGraveyard() 
	{
		return playerGraveyard;
	}

	
}
