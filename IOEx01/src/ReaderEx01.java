import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx01 {
	public static void main(String[] args) {
		FileReader br = null;
		
		try {
			br = new FileReader("./test1.txt");
			
			int data = 0 ;
			while( (data = br.read()) != -1) {
				System.out.print( (char)data );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if( br!=null)  try {br.close();} catch(IOException e){}
		}
	}
}
