package Deck;

import java.io.Serializable;

public class Card implements Serializable {
    private String suit;
    private char card;
    private int value;

    public Card(char card, String suit, int value) {
        this.card = card;
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public char getCard() {
        return card;
    }

    public void setCard(char card) {
        this.card = card;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCardWithSuit() {
        return card + suit;
    }
}
