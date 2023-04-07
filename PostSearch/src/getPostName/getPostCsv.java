package getPostName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class getPostCsv {
    public static void main(String[] args) {
        try {
            // CSV 파일 경로
            String csvFilePath = "./zipcode_seoul_utf8_type2.csv";

            // MariaDB 연결 정보
            String url = "jdbc:mariadb://localhost:3306/post";
            String user = "root";
            String password = "root";

            // MariaDB 연결
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // CSV 파일 읽기
            BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
            String line = null;

            // 삽입 쿼리
            String insertQuery = "INSERT INTO zippost(zipcode, city, region, dong, address) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            while ((line = br.readLine()) != null) {
                // CSV 파일에서 데이터 읽기
                String[] row = line.split(",");
                String zipcode = row[0];
                String city = row[1];
                String region = row[2];
                String dong = row[3];
                String address = row[4];

                // 삽입 쿼리에 데이터 바인딩
                pstmt.setString(1, zipcode);
                pstmt.setString(2, city);
                pstmt.setString(3, region);
                pstmt.setString(4, dong);
                pstmt.setString(5, address);

                // 삽입 쿼리 실행
                pstmt.executeUpdate();
            }

            // 연결과 리소스 해제
            pstmt.close();
            conn.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}