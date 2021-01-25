package com.cts.cts2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
			try {
					is = new FileInputStream
							("C:\\Users\\Gyan\\eclipse-workspace\\cts2020\\src\\myTest.txt");

				 os = new FileOutputStream("C:\\Users\\Gyan\\eclipse-workspace\\cts2020\\src\\myOutput.txt");
				int i = 0; 
				byte[] b = new byte[20];
				i=is.read(b);
			  while(i!=-1) {
				  os.write(i);
				  i=is.read(b);
				  //System.out.println();
			  }; 
  
  
  } catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	try {
		is.close();
		os.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	}

}
