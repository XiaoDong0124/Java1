package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		
		File dir = new File("C:\\java董\\JAVA workspace\\JavaLab\\src");
		File[] files=dir.listFiles();
		
		for(File file:files) {
			System.out.println(file.getName()+(file.isDirectory()?"我是目錄":""));
			long lastModified = file.lastModified();//java.util.Date
			Date date = new Date(lastModified);
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			System.out.println(df.format(date));
		}
	}

}
