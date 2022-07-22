

/**
 * public class Test {
 * public static void main(String[] args) {
 * System.out.println(SingleInstance.getInstance());
 * }
 * }
 * <p>
 * class SingleInstance{
 * <p>
 * private static SingleInstance instance = new SingleInstance();
 * <p>
 * private SingleInstance() {
 * }
 * <p>
 * public static SingleInstance getInstance(){
 * return instance;
 * }
 * }
 * <p>
 * public class Test {
 *
 * @SuppressWarnings({"all"}) public static void main(String[] args) throws InterruptedException {
 * <p>
 * Thread thread = new Thread(new T());
 * System.out.println(Thread.currentThread().getName());
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("hi " + i);
 * Thread.sleep(1000);
 * if (i == 5){
 * thread.start();
 * thread.join();
 * }
 * }
 * }
 * }
 * <p>
 * class T implements Runnable {
 * <p>
 * int count = 0;
 * @Override public void run() {
 * System.out.println(Thread.currentThread().getName());
 * while (true) {
 * System.out.println("hello " + ++count);
 * try {
 * Thread.sleep(1000);
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * if (count == 10) {
 * System.out.println("子线程结束...");
 * break;
 * }
 * }
 * }
 * }
 * <p>
 * public class Test {
 * <p>
 * public static void main(String[] args) {
 * <p>
 * Test test = new Test();
 * test.readFile();
 * }
 * <p>
 * public void readFile(){
 * <p>
 * String filePath = "d:\\hello.txt";
 * FileOutputStream fileOutputStream = null;
 * try {
 * fileOutputStream = new FileOutputStream(filePath,true);
 * String name = "java";
 * fileOutputStream.write(name.getBytes());
 * } catch (IOException e) {
 * e.printStackTrace();
 * } finally {
 * try {
 * fileOutputStream.close();
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * }
 * }
 * }
 * <p>
 * public class Test {
 * <p>
 * public static void main(String[] args) throws UnknownHostException {
 * <p>
 * InetAddress localHost = InetAddress.getLocalHost();
 * System.out.println(localHost);//DESKTOP-KAS8S24/192.168.253.1
 * <p>
 * InetAddress host = InetAddress.getByName("DESKTOP-KAS8S24");
 * System.out.println(host);
 * <p>
 * InetAddress baiDuHost = InetAddress.getByName("www.baidu.com");
 * System.out.println(baiDuHost);
 * System.out.println(baiDuHost.getHostAddress());
 * <p>
 * }
 * }
 * <p>
 * public class Test {
 * @SuppressWarnings({"all"}) public static void main(String[] args) throws InterruptedException {
 * <p>
 * Thread thread = new Thread(new T());
 * System.out.println(Thread.currentThread().getName());
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("hi " + i);
 * Thread.sleep(1000);
 * if (i == 5){
 * thread.start();
 * thread.join();
 * }
 * }
 * }
 * }
 * <p>
 * class T implements Runnable {
 * <p>
 * int count = 0;
 * @Override public void run() {
 * System.out.println(Thread.currentThread().getName());
 * while (true) {
 * System.out.println("hello " + ++count);
 * try {
 * Thread.sleep(1000);
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * if (count == 10) {
 * System.out.println("子线程结束...");
 * break;
 * }
 * }
 * }
 * }
 * <p>
 * public class Test {
 * <p>
 * public static void main(String[] args) {
 * <p>
 * Test test = new Test();
 * test.readFile();
 * }
 * <p>
 * public void readFile(){
 * <p>
 * String filePath = "d:\\hello.txt";
 * FileOutputStream fileOutputStream = null;
 * try {
 * fileOutputStream = new FileOutputStream(filePath,true);
 * String name = "java";
 * fileOutputStream.write(name.getBytes());
 * } catch (IOException e) {
 * e.printStackTrace();
 * } finally {
 * try {
 * fileOutputStream.close();
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * }
 * }
 * }
 * <p>
 * public class Test {
 * <p>
 * public static void main(String[] args) throws UnknownHostException {
 * <p>
 * InetAddress localHost = InetAddress.getLocalHost();
 * System.out.println(localHost);//DESKTOP-KAS8S24/192.168.253.1
 * <p>
 * InetAddress host = InetAddress.getByName("DESKTOP-KAS8S24");
 * System.out.println(host);
 * <p>
 * InetAddress baiDuHost = InetAddress.getByName("www.baidu.com");
 * System.out.println(baiDuHost);
 * System.out.println(baiDuHost.getHostAddress());
 * <p>
 * }
 * }
 */

/**
 * public class Test {
 *
 *     @SuppressWarnings({"all"})
 *     public static void main(String[] args) throws InterruptedException {
 *
 *         Thread thread = new Thread(new T());
 *         System.out.println(Thread.currentThread().getName());
 *         for (int i = 1; i <= 10; i++) {
 *             System.out.println("hi " + i);
 *             Thread.sleep(1000);
 *             if (i == 5){
 *                 thread.start();
 *                 thread.join();
 *             }
 *         }
 *     }
 * }
 *
 * class T implements Runnable {
 *
 *     int count = 0;
 *     @Override
 *     public void run() {
 *         System.out.println(Thread.currentThread().getName());
 *         while (true) {
 *             System.out.println("hello " + ++count);
 *             try {
 *                 Thread.sleep(1000);
 *             } catch (InterruptedException e) {
 *                 e.printStackTrace();
 *             }
 *             if (count == 10) {
 *                 System.out.println("子线程结束...");
 *                 break;
 *             }
 *         }
 *     }
 * }
 */

/**
 * public class Test {
 *
 *     public static void main(String[] args) {
 *
 *         Test test = new Test();
 *         test.readFile();
 *     }
 *
 *     public void readFile(){
 *
 *         String filePath = "d:\\hello.txt";
 *         FileOutputStream fileOutputStream = null;
 *         try {
 *             fileOutputStream = new FileOutputStream(filePath,true);
 *             String name = "java";
 *             fileOutputStream.write(name.getBytes());
 *         } catch (IOException e) {
 *             e.printStackTrace();
 *         } finally {
 *             try {
 *                 fileOutputStream.close();
 *             } catch (IOException e) {
 *                 e.printStackTrace();
 *             }
 *         }
 *     }
 * }
 */

/**
 * public class Test {
 *
 *     public static void main(String[] args) throws UnknownHostException {
 *
 *         InetAddress localHost = InetAddress.getLocalHost();
 *         System.out.println(localHost);//DESKTOP-KAS8S24/192.168.253.1
 *
 *         InetAddress host = InetAddress.getByName("DESKTOP-KAS8S24");
 *         System.out.println(host);
 *
 *         InetAddress baiDuHost = InetAddress.getByName("www.baidu.com");
 *         System.out.println(baiDuHost);
 *         System.out.println(baiDuHost.getHostAddress());
 *
 *     }
 * }
 */

/**
 * public class Test {
 *
 *     public static void main(String[] args) throws IOException {
 *
 *         ServerSocket serverSocket = new ServerSocket(9998);
 *         Socket socket = serverSocket.accept();//阻塞，等待连接
 *         //System.out.println(accept.getClass());
 *         InputStream inputStream = socket.getInputStream();
 *         //读字节流
 *         byte[] buf = new byte[1024];
 *         int readLen = 0;
 *
 *         if ((readLen = inputStream.read(buf)) != -1){
 *             System.out.println(new String(buf,0,readLen));
 *         }
 *
 *         OutputStream outputStream = socket.getOutputStream();
 *         outputStream.write("hi".getBytes());
 *         //socket.shutdownOutput();
 *
 *         outputStream.close();
 *         inputStream.close();
 *         socket.close();
 *         serverSocket.close();
 *     }
 * }
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * public class Test {
 *
 *     @SuppressWarnings({"all"})
 *     public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
 *
 *         Properties properties = new Properties();
 *         properties.load(new FileInputStream("src\\mysql.properties"));
 *
 *         String url = properties.getProperty("url");
 *         String user = properties.getProperty("user");
 *         String password = properties.getProperty("password");
 *         String driver = properties.getProperty("driver");
 *
 *         Class.forName(driver);
 *
 *         Connection connection = DriverManager.getConnection(url, user, password);
 *         Statement statement = connection.createStatement();
 *         String sql = "select * from t_user";
 *         ResultSet resultSet = statement.executeQuery(sql);
 *         while (resultSet.next()) {
 *             int no = resultSet.getInt(1);
 *             String name = resultSet.getString(2);
 *             int age = resultSet.getInt(3);
 *             String address = resultSet.getString(4);
 *             System.out.println(no + "\t" + name + "\t" + age + "\t" + address);
 *         }
 *
 *         //System.out.println(i > 0 ? "successful" : "fail");
 *         resultSet.close();
 *         statement.close();
 *         connection.close();
 *
 *     }
 * }
 */

public class Test {

    public static void main(String[] args) throws SQLException {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println("connect successful!");
        connection.close();
        /*
        
        */

    }
}


