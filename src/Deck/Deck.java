package Deck;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck implements Serializable {
    public ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        generateDeck();
        suffle();
    }

    public void generateDecks(int numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++)
            generateDeck();
    }

    public void generateDeck() {
        char[] faces = new char[]
                {'A', '2', '3', '4', '5', '6', '7',
                        'Q', 'J', 'K'};
        String[] suits = new String[]
                {"♣", "♥", "♠", "♦"};

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < faces.length; j++)
                cards.add(new Card(faces[j], suits[i], j));
    }

    public void suffle() {
        Collections.shuffle(cards);
    }

    public Card getCard() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public void printDeck() {
        for (Card card : cards)
            System.out.println(card.getCard() + card.getSuit() + "  Value: " + card.getValue());
    }
}