//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
package hw2;

public class Hw2_5 {
	public static void main(String[] args) {
		int i = 1, count = 0;
		for(i = 1; i <= 49; i++) {
			if(i % 4 == 0 || i % 10 == 0) {
				continue;
			}
			count++;
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.println("總共 = " + count);
	}
}
