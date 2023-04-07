import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		//전체파일읽기
		try {
			fis = new FileInputStream("./test1.txt");
			
			int data = 0;
			while( (data = fis.read()) != -1 ); {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {fis.close();} catch(IOException e) {}
		}
	}

}
