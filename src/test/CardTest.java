package test;

import game.Card;
import game.Suit;

import org.junit.Test;

public class CardTest {

	@Test
	public void cardTest() {
		Card myCard = new Card(Suit.SPADES, 1);
		assert (Suit.SPADES.equals(myCard.getSuit()));
		assert (1 == myCard.getCardNumber());
		
		myCard = new Card(Suit.HEARTS, 11);
		assert (Suit.HEARTS.equals(myCard.getSuit()));
		assert (11 == myCard.getCardNumber());
	}

}
