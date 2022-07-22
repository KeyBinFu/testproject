import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        //socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        //读字节流
        byte[] buf = new byte[1024];
        int readLen = 0;

        if ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
