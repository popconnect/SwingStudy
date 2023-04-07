package file;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args) {
		//파일 / 디렉토리
		//경로 - 절대 / 상대
		//디렉토리를 절대경로
		File file1 = new File( "C:\\java");
		File file2 = new File( "C:/java");
		//디렉토리를 상대경로
		File file3 = new File( "./java");
		
		File file4 = new File( "c:/java/test.txt");
		File file5 = new File( "./test.txt");
		
		File file6 = new File("c:/java/", "text.txt");
		
	}
}
