import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new  FileOutputStream("./test2.txt", true));
			bos.write('a');
			bos.write('b');
			bos.write('\n');
			bos.write('c');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("[에러] : " + e.getMessage());
	}finally {
			if(bos != null) try {bos.close();} catch(IOException e) {}
		}
		
		//출력내용없음
		System.out.println("출력완료");
	}
}
