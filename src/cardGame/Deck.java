package cardGame;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck(int noDecks) {

		for (int i = 0; i < noDecks; i++) {
			makeDeck();

		}

		Collections.shuffle(cards);
	}

	private ArrayList<Card> makeDeck() {
		// builds a single 52 card deck to be thrown into the constructor
		for (eSuit Suit : eSuit.values()) {

			for (eRank Rank : eRank.values()) {

				cards.add(new Card(Rank, Suit));
			}
		}

		return cards;
	}

	public Card Draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
	}

	public int size() {
		return cards.size();
	}

}