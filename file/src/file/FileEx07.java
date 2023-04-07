package file;
import java.io.File;
import java.io.IOException;
public class FileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File( "C:\\Users\\Quiz\\Desktop\\gitmanage\\file\\dir1");
		File file2 = new File( "C:\\Users\\Quiz\\Desktop\\gitmanage\\file\\dir2");
		/*
		 * if(file.mkdir()) { System.out.println("성공"); } else {
		 * System.out.println("실패"); } file.renameTo(file2);
		 */
		/* file2.delete(); */
		File file3 = new File("C:\\Users\\Quiz\\Desktop\\gitmanage\\file\\text2.txt");
		try {
			file3.createNewFile();
			System.out.println("파일생성");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file3.delete();
	}
}
