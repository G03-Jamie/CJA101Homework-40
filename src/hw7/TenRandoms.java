package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 
//(請使用append功能讓每次執行結果都能被保存起來)
public class TenRandoms {

	public static void main(String[] args) throws IOException {

		File file = new File("Data.txt");
		try (FileOutputStream fos = new FileOutputStream(file, true);
			 BufferedOutputStream bos = new BufferedOutputStream(fos);
			 PrintStream ps = new PrintStream(bos)) 
	    {
			List<Integer> list = new ArrayList<>();

			while (list.size() != 10) {
				int r1 = (int) (Math.random() * 1000) + 1;
				list.add(r1);
			}

			Iterator<Integer> objs = list.iterator();
			while (objs.hasNext()) {
				ps.print(objs.next() + " ");
			}
			ps.println();
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
