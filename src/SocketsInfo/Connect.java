package SocketsInfo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author rferreira
 */
public class Connect {

    public static void send(Socket socket, Object object) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(object);

        } catch (IOException ex) {
            System.out.println("*Connect: send method failed >> ERROR: " + ex);
        }
    }

    public static Object receive(Socket socket) {

        Object object = null;

        try {
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            object = is.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("*Connect: receive method failed >> ERROR: " + ex);
        }
        return object;
    }
}
