package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:\\JAVA\\io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				) {
			
			System.out.println("available="+fis.available());
				int b = bis.read();//讀一個byte
				System.out.println("byte="+b);
				char c=(char)b;
				System.out.println(c);//ascii table
				
				System.out.println("available="+fis.available());
				b=bis.read();//再讀一個byte,如果回傳-1代表讀到底了.沒有東西了
				c=(char)b;
				System.out.println(c);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
