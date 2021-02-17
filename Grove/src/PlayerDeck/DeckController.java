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

	private byte waterAffinityMultiplier;
	private byte fireAffinityMultiplier;
	private byte airAffinityMultiplier;
	private byte earthAffinityMultiplier;
	
	private ArrayList<Card> playerDeck = new ArrayList<>();
	private ArrayList<Card> playerHand = new ArrayList<>();
	private ArrayList<Card> playerGraveyard = new ArrayList<>();
	
	public void shuffleDeck()
	{
		Collections.shuffle(playerDeck);
	}
	
	/**
	 * Creates a temporary local variable of type card to save on one search loop
	 * removes the first card on top of the deck.
	 * adds the temporary card to players hand.
	 * Adds a tick to affinityMultiplier of the specific elemental type.
	 */
	public void drawCard() 
	{
		// Temp card to save 1 search algorithm
		Card tempCard = playerDeck.get(playerDeck.size()-1);
		playerDeck.remove(playerDeck.size()-1);
		
		playerHand.add(tempCard);
		affinityMultiplier(tempCard.elementalType);
		
		
		shuffleDeck();
	}
	
	public void affinityMultiplier(Element ele)
	{
		switch(ele) 
		{
		case AIR:
			airAffinityMultiplier++;
			break;
		case WATER:
			waterAffinityMultiplier++;
			break;
		case EARTH:
			earthAffinityMultiplier++;
			break;
		case FIRE:
			fireAffinityMultiplier++;
			break;
		}
	}
	
	public void drawHand()
	{
		for(int i = 0; i < 7; i++)
		{
			drawCard();
		}
	}
	
	/**
	 * Adjusts elemental multiplier.
	 * Adds player card to grave yard.
	 * Removes card from players hand.
	 * @param card
	 * @param cardIndex
	 */
	public void discardCard(Card card, byte cardIndex)
	{
		affinityMultiplier(card.elementalType);
		
		playerGraveyard.add(card);
		
		playerHand.remove(cardIndex);
		
	}

	public ArrayList<Card> getPlayerDeck()
	{
		return playerDeck;
	}

	 //loops through players hand and displays through output.
	public void displayHand() 
	{
		for(Card c: playerHand)
		{
			System.out.println(c.toString());
		}
	}
	
	
	public void displayGraveyard() 
	{
		for(Card c: playerGraveyard)
		{
			System.out.println(c.toString());
		}
	}
	
	
	/**
	 * Creates 52 objects of type card, then places them into the player deck.
	 */
	private void createPlayerDeck() 
	{
		
		for(int i = 0; i < 51; i++)
		{
			// look up the list and or database of cards
			playerDeck.add(new Card("Name", "Description",(byte) 1,(byte) 1, Range.MELEE,
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
