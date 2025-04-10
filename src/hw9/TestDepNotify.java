package hw9;

public class TestDepNotify {
	public static void main(String[] args) {

		DepNotify money = new DepNotify();
		Mom m = new Mom(money);
		Son s = new Son(money);

		s.start();
		m.start(); // 啟動兩個執行緒

		try {
			s.join(); // 等熊大執行完
			m.join(); // 等媽媽執行完

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("程式結束");
	}

}
