package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleRead {
	public static void main(String[] args) throws IOException {
		File file = new File("Sample.txt");

		try (FileInputStream fr = new FileInputStream(file); // 開啟檔案的位元流
				InputStreamReader isr = new InputStreamReader(fr, "UTF-8"); // // 把位元流轉成字元流，並指定 UTF-8 編碼
				BufferedReader br = new BufferedReader(isr))// 加入緩衝區，提高效能 + 支援 readLine()
		

		{	System.out.println("還沒讀的位元數: " + fr.available());

			String row;
			int line = 0;
			int charcount = 0;

			while ((row = br.readLine()) != null) {
				line++;
				charcount += row.length();
				System.out.println(row);
				System.out.flush();
			}
			System.out.println("Sample.txt檔案共有" + file.length() + "個位元組，" + charcount + "個字元，" + line + "列資料");
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
