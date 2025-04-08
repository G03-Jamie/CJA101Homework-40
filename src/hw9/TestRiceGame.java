package hw9;


public class TestRiceGame {
	public static void main(String[] args) {
		System.out.println("------大胃王快食比賽開始!-----");
//		RiceGame r1 = new RiceGame();
//		RiceGame r2 = new RiceGame();
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		t1.setName("饅頭人");
//		t2.setName("詹姆士");
		
		
		Thread t1 = new Thread(new RiceGame("饅頭人"));
		Thread t2 = new Thread(new RiceGame("詹姆士"));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("------大胃王快食比賽結束!-----");
		
	}
}