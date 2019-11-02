package trabalho_final;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gabriel
 */
public class Servidor {    
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket server = new ServerSocket(25000, 10);
            // reusar porta 25000 ao rodar o servidor novamente
            server.setReuseAddress(true);
            while(true)
            {
                Socket connection = server.accept();
                //ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
                //output.close();
                //connection.close();
                //server.close();
                
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
