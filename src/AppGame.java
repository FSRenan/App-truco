import Assets.PrintAssets;
import Deck.Card;
import SocketsInfo.Connect;
import SocketsInfo.Get;
import SocketsInfo.Post;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGame {
    static Socket socket;
    private static String ipServer = "localhost";
    private static final int portServer = 9600;

    public static void main(String[] args) throws IOException {
        Get get;
        Post post = new Post();
        ArrayList<Card> cards;

        PrintAssets.println.blue("******************** BEM-VINDO AO TRUCO GAME ********************");
        // insertServerIP();

        socket = new Socket(ipServer, portServer);

        //Sending commands
        post.setCommand("start");
        Connect.send(socket, post);
        //Get BDServer return
        get = (Get) Connect.receive(socket);

        cards = get.getCards();

        PrintAssets.println.green("Suas cartas: \n"
                + cards.get(0).getCardWithSuit() + " "
                + cards.get(1).getCardWithSuit() + " "
                + cards.get(2).getCardWithSuit() + " ");

        socket.close();

    }

    public static void insertServerIP() {
        String ip;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n>> ENTER SERVER IP");

        System.out.print("SERVER> localhost: ");
        ip = scanner.nextLine();
        if (!ip.isEmpty()) {
            ipServer = ip;
        }

        System.out.println("\nSERVER IP> " + ipServer + ":" + portServer);
        System.out.println("\n");
    }
}
