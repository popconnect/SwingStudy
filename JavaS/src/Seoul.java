import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Seoul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(
					new FileReader("./zipdoro.csv"));
			bw = new BufferedWriter(
					new FileWriter("./newSeocho.txt"));
			
			String str = "";
			while( ( str = br.readLine()) != null) {
			String[] arrZipcode = str.split(" ");
			System.out.println(arrZipcode[2]);
			if(arrZipcode[1].equals("서초구")) {
				System.out.println(arrZipcode[1]);
				bw.write(str + System.lineSeparator());
				}
			}
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			if( br!=null)  try {br.close();} catch(IOException e){}	
		}
	}
}
	

