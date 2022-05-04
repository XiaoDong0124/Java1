package io;
import java.net.URL;

import javax.print.DocFlavor.INPUT_STREAM;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class Downloadfile {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		try(InputStream is =url.openStream();
				BufferedInputStream bis =new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream("c:\\java\\a.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			byte[]buffer = new byte[1024];//搬到一個位置在分幾段進去
			int length;
			while ((length=bis.read(buffer))!=-1) {
				bos.write(buffer,0,length);
			}
			System.out.println("done");
		}catch (IOException e) {
			e.printStackTrace();
		}
		}

}
