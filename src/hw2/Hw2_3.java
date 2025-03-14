//計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
package hw2;

public class Hw2_3 {
	public static void main(String[] args) {
		int sum = 1, i = 1, j = 1;
		while (i <= 10 && j <= 9) {
			sum *= i;
			if (j <= 9) {
				System.out.print(j + "*");
			}
			j++;
			i++;

		}

		System.out.print(i + "=" + sum);

	}
}
