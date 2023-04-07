package file;

import java.io.File;
import java.util.Arrays;


public class FileEx06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Quiz");

		File[] fileLists = file.listFiles();
		for(File f : fileLists) {
			if(f.isDirectory()) {
				System.out.println("[" + f.getName()+ "]");
			} else {
				System.out.println(f.getName());
			}
		}
	}
}
	
	


