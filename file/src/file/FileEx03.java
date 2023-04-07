package file;
import java.io.File;
import java.io.IOException;
public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:/java/text.text");
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		
		File file2 = new File("./");
		System.out.println(file2.getPath());
		try {
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
