//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
package hw1;

public class Hw1_4 {
	public static void main(String[] args) {
		final double PI = 3.1415;
			int radius = 5;
			double circumference = radius*2*PI;
			double area = Math.pow(radius,2)*PI;
			System.out.printf("圓面積=%.4f%n", area);
			System.out.printf("圓周長=%.4f", circumference);
	}
}
