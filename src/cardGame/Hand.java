
package cardGame;

import java.util.ArrayList;

import pkgEnum.eRank;

public class Hand {
	
	private int iScore;

	private ArrayList<Card> cards = new ArrayList<Card>();

	Deck d = new Deck(1);

	public Hand() {

	}

	public int[] ScoreHand() {
		int[] iScore = new int[2];

		iScore[0] = 0;
		iScore[1] = 0;

		boolean bAce = false;

		for (Card c : cards) {
			iScore[0] += c.geteRank().getiCardValueMin();
			if (c.geteRank() == eRank.ACE) {
				bAce = true;
			}

		}
		iScore[1] = (bAce) ? iScore[0] + 10 : iScore[0];
		
		SetHandScore(iScore);

		return iScore;
	}

	public void Draw(Deck d) throws Exception {
		cards.add(d.Draw());
	}

	private void AddCard(Card c) {
		cards.add(c);
	}

	public boolean bCanDealerHit() {

		for (int iScore : ScoreHand()) {
			if (iScore >= 17) {
				return false;
			}
		}
		return true;
	}

	public boolean bCanPlayerDraw() {
		for (int iScore : ScoreHand()) {
			if (iScore <= 21) {
				return true;
			}
		}
		return false;
	}

	public boolean isBlackJack() {
		int[] iScores = ScoreHand();

		if ((iScores[1] == 21) && (cards.size() == 2)) {
			return true;
		}
		return false;
	}
	
	
	private void SetHandScore(int[] Scores) {
		this.iScore = Scores[0];
		if (Scores[1] <= 21) {
			iScore = Scores[1];
		}
	}

}