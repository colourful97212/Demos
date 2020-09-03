package aboutMINASomething;


import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @Description
 * @Version
 * @Date 9/3/2020
 * @Author Gon
 */
public class SocketClient
{
    public static void main(String[] args) throws IOException
    {
        Socket client = new Socket("127.0.0.1", 8801);
        //client.connect();
        //int gg = client.getReceiveBufferSize();
        //System.out.println();
        OutputStream outputStream = client.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String request = scanner.nextLine();

            outputStreamWriter.write(request + "\n");

            outputStreamWriter.flush();
        }

        InputStream inputStream = client.getInputStream();
        byte[] bytes = IOUtils.toByteArray(inputStream);
        String response = new String(bytes);
        System.out.println(response);



    }
}
