import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SqlMapClient {
	public SqlMapClient(){
		Statement sql;
		ResultSet rs;
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //����JDBC����  
		String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=UniversityDB";   //���ӷ����������ݿ�sample  
		String userName = "sa";   //Ĭ���û���  
		String userPwd = "wkt19910602";   //����  
		Connection dbConn;  
		try {
			Class.forName(driverName);  
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd); 
			sql=dbConn.createStatement();
			rs=sql.executeQuery("select*from course");
			System.out.println("Connection Successful!");   //������ӳɹ� ����̨���Connection Successful! 
		}catch (Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		SqlMapClient ss = new SqlMapClient();
	}
}
