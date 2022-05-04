package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {
		
		try {
			checkFile("c:\\java\\aaa.txt");
			System.out.println("aaa");//我是印不出來的
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		
	}
	
	public static void checkFile(String filepath) throws FileNotFoundException{
		File file = new File(filepath);
		if(! file.exists()) {
			//產生exception物件
			//FileNotFoundException fnf =new FileNotFoundException(filepath+"找不倒檔案");
			//用throw拋出這個Exception
			throw new FileNotFoundException(filepath+"找不到檔案");
			//file+"找不到檔案是會被print出來的"
		}
	}

}
