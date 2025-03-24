//請設計一個方法為randAvg()，
//從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖
package hw5;

public class RandAvg {
	
	private int avg; //平均值
	private int num; //亂數
	
	

	public void randAvg() {
		
		int sum = 0;
		
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			num = (int)(Math.random()*101);
			array[i]=num;
			//System.out.print("亂數= " + array[i] + " ");
		    sum += num; 
		}  
		System.out.println();
		
		avg = sum/10;
		System.out.println("本次亂數結果: " );
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); //列印矩陣要放在迴圈裡
		}
		System.out.println();
		System.out.println(avg);
		 
		}
		
		
	}


