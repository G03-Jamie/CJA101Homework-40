package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {
	
	public CopyFile() {};

	public void copyFile(String file1, String file2) throws IOException {
		
		try(FileReader inr= new FileReader(file1);
			BufferedReader inbr = new BufferedReader(inr);
				
			
			FileWriter outw = new FileWriter(file2, true);
			BufferedWriter outbw = new BufferedWriter(outw);
			PrintWriter outpw = new PrintWriter(outbw))
			{
			String line;
			while((line = inbr.readLine()) != null ) {
					outpw.println(line);
					outpw.flush();
			}
			System.out.println("檔案複製成功");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
