package cardGame;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private ArrayList<Card> singleDeck = new ArrayList<Card>();

	public Deck(int noDecks) {
		// makes a big deck using n number of single decks
		for (int i = 0; i < noDecks; i++) {
			
			makeDeck();
			
			cards.addAll(singleDeck);
		}
		
		Collections.shuffle(cards);
	}

	private ArrayList<Card> makeDeck()					// build a single deck
	{
		for (eSuit Suit : eSuit.values())  {		// for every Suit (ace, spades...)
			
			for (eRank Rank : eRank.values()) {		// for every Rank (1,2,3...)
				
				singleDeck.add(new Card(Rank, Suit));	// make a new card of the suit and rank and add it to single deck
			}
		}
		
		Collections.shuffle(singleDeck);
		
		return singleDeck;
	}
	
	public Card draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
	}
	
	public int size()
	{
		return cards.size();
	}

}