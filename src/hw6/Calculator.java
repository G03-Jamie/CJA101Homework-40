package hw6;

import java.util.Scanner;

public class Calculator {

	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		this.x = x;
		this.y = y;
		setCalculator();
	}

	public void setCalculator() throws CalException {

		keyIn();
		if (x > 0 && y > 0) {
			
		} else if (y < 0)
			throw new CalException("次方為負值，結果回傳不為整數!");

		else if (x == 0 && y == 0)
			throw new CalException("0的0次方沒有意義");
		
		

	}



	public void keyIn() {
		System.out.println("請輸入x的值: ");
		 
		Scanner sc = new Scanner(System.in);
		this.x = Integer.parseInt(sc.nextLine());
		System.out.println("請輸入y的值: ");
		this.y = Integer.parseInt(sc.nextLine());
	}
	
	public int powerXY(int x, int y) {
		return (int) Math.pow(x, y);

	}

	public void showinfo() {
		System.out.println(x + "的" + y + "次方等於" + powerXY(x, y));
	}

}
