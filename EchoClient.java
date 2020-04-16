package GeekBrains;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

class EchoClient {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {

            try {
                try {
                    clientSocket = new Socket("localhost", 8080);
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    //BufferedReader input = new BufferedReader(new InputStreamReader( StandardCharsets.UTF_8));
while(true) {



    while (in.ready()) {
        String serverWord = in.readLine(); // ждём, что скажет сервер
        System.out.println(serverWord); // получив - выводим на экран
    }

    String word = reader.readLine(); // ждём  клиент
    out.write(word + "\n"); // отправляем сообщение на сервер
    out.flush();
    System.out.println("Отправлено");


}
                } finally {
                    System.out.println("Клиент был закрыт...");
                    clientSocket.close();
                    in.close();
                    out.close();
                }

            } catch (IOException e) {
                System.err.println(e);
            }
        }

    }
