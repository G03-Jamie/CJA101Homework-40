//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
package hw2;

public class Hw2_4 {
	public static void main(String[] args) {
		int i = 1;
		for(;i <= 10; i ++) {
			int count = i * i;
			System.out.print(count + " ");
		}
	}
}
