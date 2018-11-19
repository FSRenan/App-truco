import Assets.PrintAssets;
import Deck.Deck;
import SocketsInfo.Connect;
import SocketsInfo.Get;
import SocketsInfo.Post;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class Server {

    static Socket client_socket;
    static ServerSocket controller_socker_receive;
    public static final int PORT = 9600;

    public Server() {
        try {
            controller_socker_receive = new ServerSocket(PORT);
            PrintAssets.println.blue("******************** SERVER ********************");
            System.out.println("*Running...");
        } catch (IOException ex) {
            System.err.println("*Server: Creating server failed >> ERROR: " + ex);
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int players = 0;

        //Initialize Server Socket
        new Server();

        Deck deck = new Deck();

        Post post;
        Get get = new Get();

        while (connect()) {
            //Receive Client request

            post = (Post) Connect.receive(client_socket);

            switch (post.getCommand()) {
                case "start":
                    players++;
                    break;
            }
            //Set user cards
            get.setCards(new ArrayList(Arrays.asList(deck.getCard(), deck.getCard(), deck.getCard())));

            //Set game status
            if (players > 1) get.setGameStatus(1);

            //Setting Return
            Connect.send(client_socket, get);
        }

    }

    //Client connection
    static boolean connect() {
        boolean ret;
        try {
            client_socket = controller_socker_receive.accept();              // fase de conexão
            ret = true;
        } catch (IOException ex) {
            System.out.println("*BDServer: Connection failed >> ERROR: " + ex);
            ret = false;
        }
        return ret;
    }

}
