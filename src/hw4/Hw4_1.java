
package hw4;

public class Hw4_1 {
	/*
	 * 有個一維陣列如下： {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	 */

	static void passArray(int[] intArray) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		avg = sum / intArray.length;
		System.out.printf("平均值=%.2f%n", avg);
		System.out.println("大於平均值的元素: ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
				System.out.print( intArray[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] iArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		passArray(iArray);
		System.out.println();
	
		



/* 請建立一個字串，經過程式執行後，輸入結果是反過來的
 * 例如String s = “Hello World”，執行結果即為dlroW olleH */
	
		  String[] y = { "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d" };
		  String[] z = new String[y.length]; 
		  
		  for(int k = 0;  k < 11; k++) {
			  
			  z[k] = y[y.length - k -1];  //取陣列元素個數
			  System.out.print(z[k]);
		  }
		  System.out.println();
		  
		  String s = "Hello World";  //取字串字元個數
			for (int f = s.length() - 1; f >= 0 ; f--) {
				System.out.print(s.charAt(f));
			}
			
		
	
		
/*
 * 有個字串陣列如下 (八大行星)： {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 */
			String star[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

			FindA findA = new FindA();  // 創建行星物件
			int total = 0;
			
			for (int i = 0; i < star.length; i++) {
				findA.setStar(star[i]);
				int count = findA.find(); //取得 find() 回傳的 count 指向給 int count
				total += count;
			}
			
			System.out.println("加總所有行星的母音總數= " + total);

	
	}
}