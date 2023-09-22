	import java.sql.Connection;
	import java.sql.DatabaseMetaData;
	import java.sql.DriverManager;
	import java.sql.SQLException;
public class TestDB {
	

	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	         Connection conn = null;
	         
	            try {
	    
	                String dbURL = ("jdbc:sqlserver://HOANGNGUYEN:1433;databaseName=QLNS;encrypt=true;trustServerCertificate=true;");
	                String user = "sa";
	                String pass = "123456";
	                conn = DriverManager.getConnection(dbURL, user, pass);
	                if (conn != null) {
	                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                    System.out.println("Tên Driver: " + dm.getDriverName());
	                    System.out.println("Phiên bản Driver: " + dm.getDriverVersion());
	                    System.out.println("Tên Cơ sở dữ liệu: " + dm.getDatabaseProductName());
	                    System.out.println("Phiên bản Cơ sở dữ liệu: " + dm.getDatabaseProductVersion());
	                }               
	    
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            } finally {
	                try {
	                    if (conn != null && !conn.isClosed()) {
	                        conn.close();
	                    }
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	       
	       
	    }

	}

