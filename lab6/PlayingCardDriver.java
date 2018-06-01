/**
	A driver for the PlayingCard class.
	@author Tao Guo
**/

import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDriver {

	public static void main(String[] args) {

		ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>();

		PlayingCard c1 = new PlayingCard(2, "spades", "black");
		PlayingCard c2 = new PlayingCard(1, "clubs", "black");
		PlayingCard c3 = new PlayingCard(5, "diamonds", "red");
		PlayingCard c4 = new PlayingCard(5, "spades", "black");
		PlayingCard c5 = new PlayingCard(3, "spades", "black");
		PlayingCard c6 = new PlayingCard(3, "hearts", "red");
		PlayingCard c7 = new PlayingCard(11, "hearts", "red");
		PlayingCard c8 = new PlayingCard(12, "hearts", "red");
		PlayingCard c9 = new PlayingCard(13, "hearts", "red");

		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		cards.add(c4);
		cards.add(c5);
		cards.add(c6);
		cards.add(c7);
		cards.add(c8);
		cards.add(c9);

		Collections.sort(cards);

		for(PlayingCard card: cards) {

			System.out.println(card);
		}

	}

}