import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyEx01 {
	public static void main(String[] args) {
		
		FileInputStream fis;
		FileInputStream fos;
		
		fis = new FileInputStream("./image1.png");
		fos = new FileInputStream("./image2.png");
		
		int data = 0;
		while((data = fis.read() != -1)) {
			fos.write(data);
		}
		System.out.println("복사성공");
	}
	
}
