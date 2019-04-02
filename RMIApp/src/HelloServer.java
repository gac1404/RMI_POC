import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements HelloService {


    public HelloServer() throws RemoteException{
        super();
    }

    //@Override
    public String echo(String input) throws RemoteException {
        System.out.println("Hello");
        return "From server: " + input;
    }
}
