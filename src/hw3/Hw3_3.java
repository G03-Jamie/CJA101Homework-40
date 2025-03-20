//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
package hw3;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("開始猜數字吧!(0~9)");
		    int i = (int)(Math.random()*10);
		   
		    	
		    while(i < 9) { 
		    	int keyIn = sc.nextInt();
		    	if(keyIn == i) {
		    		System.out.println("答對了，答案就是" + keyIn);
		    		break;
		    	}
		    	else {System.out.println("猜錯囉!");}
		    	continue;
		    }
	}
}
