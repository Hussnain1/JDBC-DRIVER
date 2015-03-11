//Different project
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class myTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("myDriver");
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password", "");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/", connectionProps);
	}

}
