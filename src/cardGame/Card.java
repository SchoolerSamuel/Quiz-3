package cardGame;
import pkgEnum.*;
public class Card {

	// attributes
	private eRank eRank;
	private eSuit eSuit;

	
	
	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}



	// constructor
	public Card(eRank eRank, eSuit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;

	}

}
