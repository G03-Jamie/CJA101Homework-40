//計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
package hw2;

public class Hw2_2 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println("1*2*3*…*10="+sum);
	}
}
