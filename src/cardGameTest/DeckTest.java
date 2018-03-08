package cardGameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cardGame.Deck;

public class DeckTest {
	Deck Deck1 = new Deck(1);
	Deck Deck6 = new Deck(6);
	Deck Deck2 = new Deck(2);
	@Test
	public void TestDeck() {
		
		assertEquals(Deck1.size(), 52);
		assertEquals(Deck2.size(), 104);
		assertEquals(Deck6.size(), 312);
		
	}

}