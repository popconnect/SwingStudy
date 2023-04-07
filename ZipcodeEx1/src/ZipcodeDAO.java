import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	private Connection conn;
	public ZipcodeDAO() {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/post";
        String user = "root";
        String password = "root";
        
        try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error] :" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error] :" + e.getMessage());
		}
	}
	
	public ArrayList<ZipcodeTO> searchZipcode(String strDong) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> addresses = new ArrayList<>();
		
		try {
			String sql = "SELECT zipcode, sido, gugun, dong, ri, bunji FROM zipcode WHERE dong LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%"); 
			
			rs = pstmt.executeQuery();
			while(rs.next() ) {
				
				ZipcodeTO to = new ZipcodeTO();
				
				to.setZipcode(rs.getString("zipcode"));
				to.setSido(rs.getString("zipcode"));
				to.setGugun(rs.getString("zipcode"));
				to.setDong(rs.getString("zipcode"));
				to.setRi(rs.getString("zipcode"));
				to.setBunji(rs.getString("zipcode"));
				
				addresses.add(to);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[ERROR] : " + e.getMessage());
		} finally {
			if (rs != null) try {rs.close();} catch(SQLException e) {};
			if (pstmt != null) try {pstmt.close();} catch(SQLException e) {};
			if (conn != null) try {conn.close();} catch(SQLException e) {};
			
		}
		return addresses;
	}
}
