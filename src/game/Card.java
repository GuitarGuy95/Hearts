package game;

public class Card {
	// Suit is an enum with values of HEARTS, SPADES, DIAMONDS, CLUBS
	private Suit suit;
	// Card number is an int where 1 is Ace, 2-10 is numbers, 11 is Jack, 12 is
	// Queen, and 13 is King
	private int cardNumber;

	// A card must be initialized with suit and card number
	public Card(Suit suit, int cardNumber) {
		this.suit = suit;
		this.cardNumber = cardNumber;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public int returnCardNumber() {
		return this.cardNumber;
	}
}
