package SocketsInfo;

import java.io.Serializable;

public class Post implements Serializable {
    private String command;
    private String card;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

}
