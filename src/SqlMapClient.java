import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SqlMapClient {
	public SqlMapClient(){
		Statement sql;
		ResultSet rs;
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //加载JDBC驱动  
		String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=UniversityDB";   //连接服务器和数据库sample  
		String userName = "sa";   //默认用户名  
		String userPwd = "wkt19910602";   //密码  
		Connection dbConn;  
		try {
			Class.forName(driverName);  
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd); 
			sql=dbConn.createStatement();
			rs=sql.executeQuery("select*from course");
			System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful! 
		}catch (Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		SqlMapClient ss = new SqlMapClient();
	}
}
