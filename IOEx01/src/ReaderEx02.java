import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./test1.txt"));
			
			/*
			 * int data = 0 ; while( (data = br.read()) != -1) { System.out.print(
			 * (char)data ); }
			 */
			//br.readline() = 엔터키
			String str = "";
			while ( (str = br.readLine()) != null) {
				System.out.println(str);
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
