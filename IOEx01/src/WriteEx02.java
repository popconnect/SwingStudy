import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("./test2.txt", true));
			
			bw.write("abc");
			bw.write("\n");
			bw.write("ced");
			bw.write("\n");
			bw.write("가나다");
			
			System.out.println("출력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(bw != null ) try {bw.close(); } catch(IOException e) {}
		}
	}
}
