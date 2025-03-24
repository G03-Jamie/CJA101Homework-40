package hw5;

import java.util.Scanner;



public class TestHw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入 width, height");
		
		int width = sc.nextInt();
	    int height = sc.nextInt();
		
		Starsquare s1 = new Starsquare(width , height); 
		//使用 new 關鍵字，在記憶體中開闢空間建立一個新的 Starsquare 類別物件。
		//同時會呼叫 Starsquare 類別裡的 建構子（constructor）：
		//建立一個 Starsquare 物件，並把它的記憶體位址指定給變數 s1，這樣之後就可以透過 s1 操作那個物件。」
		s1.starSquare();
		
		
		RandAvg a1 = new RandAvg();
		a1.randAvg();
		
		System.out.println();
		
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		Overloading w = new Overloading();
		System.out.println("int 最大值" + w.maxElement(intArray));
		System.out.println("double 最大值" + w.maxElement(doubleArray));
	
		}
}


