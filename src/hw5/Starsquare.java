//請設計一個方法為starSquare(int width, int height)，
//當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：
package hw5;

import java.util.Scanner;

public class Starsquare{
		
		private int width;
		private int height;
		
		
		
		//建構子把傳入的參數 width 和 height 存進這個物件的成員變數中。
		public Starsquare (int width, int height) {  
				this.width = width;
				this.height = height;
				
				   
			  }
	    
		public void starSquare() {
				//int [][]array = new int[height][width]; 只是要列印height 次 width 個，不用存入矩陣
				//System.out.println(array[0][0]); // 用到內容時才需要這行
			for (int i  = 0; i < height; i++ ) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
				}
			System.out.println();	
			}
		
		}
	}
