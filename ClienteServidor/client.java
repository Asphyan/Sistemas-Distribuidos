package ClienteServidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) 
        throws UnknownHostException, IOException {
            try (Socket cliente = new Socket("172.16.6.4", 12345)) {
            System.out.println("O cliente se conectou ao servidor!");

            Scanner teclado = new Scanner(System.in);
            PrintStream saida = new PrintStream(cliente.getOutputStream());

            while (teclado.hasNextLine()) {
                saida.println(teclado.nextLine());
            }
            saida.close();
            teclado.close();
        }
    }
}