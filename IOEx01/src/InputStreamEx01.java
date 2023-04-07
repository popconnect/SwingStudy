import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream = input / byte 1차 스트림
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./test1.txt");
			int data = fis.read();
			
			System.out.println(data);
			System.out.println((char)data);
			
			data = fis.read();
			System.out.println((char)data);
			
			byte[] datas = new byte[5];
			fis.read(datas);
			System.out.println((char)datas[0]);
			System.out.println((char)datas[4]);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		}	finally {
			try {fis.close();
			} catch (IOException e) {}
		}
	}
}
