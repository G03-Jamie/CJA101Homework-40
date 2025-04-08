//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數

package hw9;

public class RiceGame implements Runnable {
	private String name;
	
	public RiceGame() {
	}
	
	public RiceGame(String name) {
		this.name = name;
	}
	
	int counter = 1;
	public void run() {
	
		while(counter < 11) {
			//System.out.println( Thread.currentThread().getName() + "吃第" + counter + "碗飯");
			System.out.println( name + "吃第" + counter + "碗飯");
			counter++;
			
			try {
				Thread.sleep((int)(Math.random()*2501)+500);
			}catch(Exception e){
				
			}
		}
		//System.out.println( Thread.currentThread().getName() + "吃完了!");
		System.out.println( name + "吃完了!");
	}
	
}