import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConn {
    public static void main(String[] args) {
        getConnect();
    }
    public static Connection getConnect() {
        String driver = "org.opengauss.Driver";
        String sourceURL = "jdbc:opengauss://127.0.0.1:8080/test?user=myuser&password=myPassWord";
        Properties info = new Properties();
        Connection conn = null;
        try {
            Class.forName(driver);
        } catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
        try {
            conn = DriverManager.getConnection(sourceURL);
            System.out.println("连接成功！");
            return conn;
        } catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}
