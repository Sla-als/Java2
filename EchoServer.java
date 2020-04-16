package GeekBrains;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class EchoServer {

    private static Socket clientSocket; //сокет для общения
    private static ServerSocket server; // серверсокет
    private static BufferedReader in; // поток чтения из сокета
    private static BufferedWriter out; // поток записи в сокет
    private static BufferedReader reader;

    public static void main(String[] args) {
        try {
                server = new ServerSocket(8080);
                System.out.println("Сервер запущен!");
                clientSocket = server.accept();
                    try {
                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                        reader = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));
while (true) {
    while (input.ready()) { // чтобы считалось несколько строк
            String word = input.readLine(); // ждём пока клиент что-нибудь нам напишет
    System.out.println("Клиент: " + word);
    }
    String wordSvr = reader.readLine();
    out.write("Сервер:" + wordSvr + "\n");
    out.flush(); // выталкиваем все из буфера
    System.out.println("Отправлено");

}
            } finally {
                System.out.println("Сервер закрыт!");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}


