package hw9;

/*只要看到熊大帳戶的餘額超過3000元,媽媽就會停止匯款給熊大;
但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,
直到媽媽告知他錢已經入帳戶。 
假設媽媽一次匯款 2000 元,熊大一次提款1000元,寫一個Java程式模擬匯款10次與提款10次的情 
形。*/

import java.sql.SQLException;

public class DepNotify {
	static int money = 0;
	static boolean sonDone = false;

	public void son(int withdrow, int times) {

		synchronized (this) {

			while (money < withdrow) {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				System.out.println("媽媽被熊大要求匯款");

				try {
					wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			money -= withdrow;
			System.out.println("熊大領了" + 1000 + "，帳戶共有:" + money);
			if (times == 10) {
				notifyAll();
				sonDone = true;
			System.out.println("熊大完成第10次提款!");
			}
			if (money < 2000) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
				notifyAll(); // 熊大通知老媽匯款，繼續消費

			}

		}
	}

	public void mom(int deposit) {
		synchronized (this) {

			money += deposit;
			System.out.println("媽媽存了" + 2000 + "，帳戶共有:" + money);

			notifyAll(); // 老媽通知熊大已匯款

			while (money > 3000) {

				if (sonDone) {
					break;
				}
				try {
					System.out.println("媽媽看到餘額在3000以上，暫停匯款");
					System.out.println("熊大被老媽告知帳戶已經有錢");
					wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

class Mom extends Thread {
	DepNotify money;

	public Mom(DepNotify money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.mom(2000);
		}
		System.out.println("媽媽完成第10次匯款!");
	}
}

class Son extends Thread {
	DepNotify money;

	public Son(DepNotify money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.son(1000, i);
		}

	}
}
