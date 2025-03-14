package hw2;

public class Hw2ForDoWhile {
	public static void main(String[] args) {
		int i, j = 1;
		for (i = 1; i <= 9; i++) {

			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
				if (j == 10) {
					j = 1;
					break;
				}
			} while (j <= 9);

			System.out.println();
		}
	}
}
