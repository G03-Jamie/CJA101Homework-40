package hw5;

import java.util.Random;

public class Code {

	

	public void genAuthCode() {
		int n = 10;
		char[][] cols = new char[3][n];

		for (int j = 0; j < n; j++) {
			cols[0][j] = (char) (Math.random() * 10 + 48);
			cols[1][j] = (char) (Math.random() * 26 + 65);
			cols[2][j] = (char) (Math.random() * 26 + 97);
		}

		Random rand = new Random();

		
		char[] randcode = new char[8];
		for (int i = 0; i < 8; i++) {
			int row = (int)(Math.random()*3); // 隨機挑列（0～2）
			int col = rand.nextInt(n); // 隨機挑一個欄位
			randcode[i] = cols[row][col];
		
			
		}
		for (int i = 0; i < 8; i++) {
			System.out.print(randcode[i]);
		}

	}

}
