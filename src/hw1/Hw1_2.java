//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
package hw1;

public class Hw1_2 {
	public static void main(String[] args) {
		int dozen = 12, total =200;
		
		System.out.println(total/dozen +"打"+ total%dozen+"顆");
	}
}
