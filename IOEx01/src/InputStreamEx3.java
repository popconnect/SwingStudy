import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   BufferedInputStream bis = null;
		 
		
		//전체파일읽기
		try {
			
			bis = new BufferedInputStream(new FileInputStream("./test2.txt"));
			
			int data = 0;
			while( (data = bis.read()) != -1 ); {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bis != null) try {bis.close();} catch(IOException e) {}
			//if(fis != null)try {fis.close();} catch(IOException e) {}
		}
	}

}
