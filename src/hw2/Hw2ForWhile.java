package hw2;

public class Hw2ForWhile {
	public static void main(String[] args) {
		int i, j = 1;
		for (i = 1; i <= 9; i++) {

			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
				if (j == 10) {
					j = 1;
					break;
				}
			}
			System.out.println();
		}
	}
}
