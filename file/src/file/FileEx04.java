package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileEx04 {
	public static void main(String[] args) {
		
		File file1 = new File("C:\\Users\\Quiz\\Desktop\\gitmanage\\file\\mariadb-10.11.2-winx64.msi");
		File file2 = new File("./mariadb-10.11.2-winx64.msi");
		
		System.out.println(file1.exists());
		try {
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file1.length());
		System.out.println(file1.lastModified());
		Date date = new Date();
		System.out.println(date.toLocaleString());
	}

}
