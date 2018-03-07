package cardGameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cardGame.Deck;

public class DeckTest {
	Deck Deck1 = new Deck(1);
	Deck Deck6 = new Deck(6);
	
	@Test
	public void TestDeck() {
		
		assertEquals(Deck1.size(), 52);
		assertEquals(Deck6.size(), 312);
		
		fail("deck1 was " + Deck1.size() + " deck6 was " + Deck6.size());
	}

}