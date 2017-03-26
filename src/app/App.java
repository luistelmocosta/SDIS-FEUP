package app;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import

/**
 * Created by luiscosta on 3/26/17.
 */
public class App {

    public static void main(String[] args) {
        App app = new App(args);
        app.start();
    }


}
