package hw6;

public class CalTest {

	public static void main(String[] args) {

		boolean success = false;
		while (!success) {
			try {
				Calculator power = new Calculator();
				power.setCalculator();
				power.showinfo();
				success = true;

			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("輸入格式不正確！");

			}
		}
	}
}
