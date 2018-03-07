package cardGameTest;
import cardGame.Card;
import pkgEnum.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CardTest {
	
	private eRank eRank = pkgEnum.eRank.TWO;
	private eSuit eSuit = pkgEnum.eSuit.DIAMONDS;
	Card testCard = new Card(eRank, eSuit);
	
	@Test
	void testSuit() {
		if (testCard.geteSuit() == pkgEnum.eSuit.DIAMONDS) {
			
		}
		else {
			fail("the suit was found to be " + testCard.geteSuit());
		}
		
	}
	
	@Test
	void testRank() {
		if (testCard.geteRank() == pkgEnum.eRank.TWO) {
			
		}
		else {
			fail("the suit was found to be " + testCard.geteRank());
		}
	}

}
