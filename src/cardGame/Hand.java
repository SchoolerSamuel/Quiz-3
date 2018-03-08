
package cardGame;

import java.util.ArrayList;



public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	Deck d = new Deck(1);
	
	
	public Hand() throws Exception
	{

	}
	
	public int[] ScoreHand()
	{
		int[] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		for (Card c: cards)
		{
			iScore[0] = iScore[0] + c.geteRank().getiCardValueMin();
			iScore[1] = iScore[1] + c.geteRank().getiCardValueMax();			
		}
		
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		cards.add(d.draw());	
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}