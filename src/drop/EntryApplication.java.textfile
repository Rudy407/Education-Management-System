import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EntryApplication {
    public static void main(String[] args) {
        Connection conn = getConnect();
        // 执行sql操作
        if (conn != null) {
            getTableNames(conn);
        }
    }
    public static Connection getConnect() {
        String driver = "org.opengauss.Driver";
        String sourceURL = "jdbc:opengauss://120.46.144.9:26000/school?user=test&password=Shujuku813";
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

    public static void getTableNames(Connection conn) {
        String sql = "SELECT tablename FROM pg_tables WHERE schemaname = 'public'"; // 获取表名
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String tableName = resultSet.getString("tablename");
                System.out.println("表名: " + tableName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


