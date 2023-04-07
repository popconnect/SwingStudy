package file;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Quiz\\Desktop\\gitmanage\\StudyJVM\\bin"); 
		System.out.println(f.exists());
		
		File f1 = new File("C:\\Users\\Quiz\\Desktop\\gitmanage\\StudyJVM\\bin\\text.txt"); 
		System.out.println(f1.exists());
		
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.canRead());
		System.out.println(f1.isHidden());
	}
}
