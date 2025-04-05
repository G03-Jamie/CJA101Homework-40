package hw7;

import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，
//第一個參數所代表的檔案會複製到第二個參數代表的檔案
public class CopyFileTest {
	public static void main(String[] args) throws IOException{
		
		CopyFile file = new CopyFile();
		try {
		file.copyFile("Copy1.txt","Copy2.txt");
		}catch(IOException e){
			System.out.println("檔案複製失敗: "+e.getMessage());
			}
		}
	
}
