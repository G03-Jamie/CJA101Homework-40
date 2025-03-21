//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//通常規則：年份如果能被 4 整除，則該年為閏年。例如，2016 年和2020 年都是閏年。
//該年份同時能被 400 整除，則該年仍然是閏年。例如，2000 年是閏年，但 1900 年則不是。

package hw4;

import java.util.Scanner;

public class Hw4_3 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日");
		
	    int []x = new int[3];
		for( int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
				System.out.print(x[i]+" ");
		}
		
		
		
		int months = 0;
	    int days = 0;
		
	    for(int month = 1; month < x[1]; month++) {
	    	
		
		if(month % 2 == 1) {
			months = 31;
		}
		else if(month % 2 == 0 && month != 2) {
			months = 30;
		}
		else if((x[0] % 400 == 0 ||( x[0] % 4 == 0 || x[0] % 100 == 0) ) && month == 2){
			months = 29;
		}
		else {
			months = 28;
		}
		days += months;
		
	    }
	    int totaldays = days + x[2];
	    
		System.out.println("輸入的日期是該年的第 " + totaldays + " 天");
		 }
		
	
}
