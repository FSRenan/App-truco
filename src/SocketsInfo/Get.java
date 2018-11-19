package SocketsInfo;

import Deck.Card;

import java.io.Serializable;
import java.util.ArrayList;

public class Get implements Serializable {
    private ArrayList<Card> cards = new ArrayList<>();
    private int gameStatus = 0;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(int gameStatus) {
        this.gameStatus = gameStatus;
    }
}
