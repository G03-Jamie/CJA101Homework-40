package hw2;

public class Hw2WhileDoWhile {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i <= 9) {

			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
				if (j == 10) {
					j = 1;
					break;
				}
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
