package service;

/**
 * Created by luiscosta on 3/28/17.
 */
import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This class intents to design a
 * remote interface
 * This implementation is inspired on the Java Tutorials for RMI implementations
 * https://docs.oracle.com/javase/tutorial/rmi/designing.html
 *
 */

public interface RMI extends Remote{ //Extending the Remote Java interface, RMI interface identifies itself
                                    // as an interface whose methods can be invoked from another Java Virtual Machine
                                    // Any object that implements this interface can be a remote object.

    /**
     * This is a remote method
     * Exception is thrown by the RMI system from a remote method invocation to indicate either
     * a communication or protocol failure
     *
     * This method should backup files
     * @param filePath
     * @param replicationDeg
     * @throws RemoteException
     */
    void backup(String filePath, int replicationDeg) throws RemoteException;
    void writeID() throws RemoteException;

}