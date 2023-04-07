import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			fos = new  FileOutputStream("./test2.txt", true);
			fos.write('a');
			fos.write('b');
			fos.write('\n');
			fos.write('c');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("[에러] : " + e.getMessage());
	}finally {
			try {fos.close();} catch(IOException e) {}
		}
		
		//출력내용없음
		System.out.println("출력완료");
	}
}
