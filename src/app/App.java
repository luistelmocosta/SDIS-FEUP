package app;
import service.RMI;

import java.io.IOException;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by luiscosta on 3/26/17.
 */
public class App {

    private int peerAP; //peer access point

    /**
     * Check correct number of arguments
     * @param args
     * @return
     */

    private static boolean checkArgs(String[] args) {
        if(args.length == 2) {
            System.out.println("Wrong number of arguments");
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        //App app = new App(args);
        System.out.println("Welcome to Distributed Backup Service!");
        //app.start();

    }

    /**
     *
     *
     *
     */

    public void start() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            RMI stub = (RMI) registry.lookup(Integer.toString(peerAP));
            stub.writeID();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }


}
