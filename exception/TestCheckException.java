package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckException {
	
	public static void main(String[] args) throws IOException  {
		//FileNotFoundException 只要執行檔案都要做檢查，(非RuntimeException子類別都要處理)
		//ctrl+1:quick fix
		//try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
		//} catch (FileNotFoundException e) {
		
		//	e.printStackTrace();}//路徑可以使用\\或單/
		System.out.println("done");
		//FileReader fr = new FileReader("c:/java/aaa.txt");
		
	}

}
