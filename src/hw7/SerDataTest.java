package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDataTest {


	public static void main(String[] args) throws Exception {
		File file = new File("Data");
		if (file.mkdir()) {
			System.out.println("資料夾建立成功！");
		} else {
			System.out.println("資料夾已存在或建立失敗。");
		}
		File objFile = new File("Data","Object.ser");
		Pet[] pets = new Pet[2];
		pets[0] = new Dog("Char");
		pets[1] = new Cat("Mon");

		// 輸出
			FileOutputStream fos = new FileOutputStream(objFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < pets.length; i++) {
				oos.writeObject(pets[i]);
			}
			oos.close();
			fos.close();

		// 輸入
		FileInputStream fis = new FileInputStream(objFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(objFile.getName() + "檔案內容如下");
		System.out.println("----------------------");
		try {
			while (true) {
				((Pet)ois.readObject()).speak();   // readObject() 回傳的是 Object 型別
				System.out.println("-------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢!");
		}
		ois.close();
		fis.close();	
	}
}
