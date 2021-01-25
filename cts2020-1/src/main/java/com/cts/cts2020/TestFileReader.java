package com.cts.cts2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestFileReader {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Gyan\\eclipse-workspace\\cts2020\\src\\myTest.txt");
		try {
			Reader r = new FileReader(f);
			Reader r1 = new FileReader(f);
			int c = r.read();
			while(c!=-1) {
			//System.out.print((char)c);
			c = r.read();
			}
			
			String p = null;
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(r1);
			String line = br.readLine();
			//System.out.println(line);
			while(line!=null) {
				// p = p+line;
				sb.append(line+"\n");
				//System.out.println(line);
				line = br.readLine();
			}
			
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
					e.printStackTrace();
		}
		

	}

}
