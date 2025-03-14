//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
package hw1;

public class Hw1_3 {
	public static void main(String[] args) {
		int min = 60, hr = 3600, day = 86400 ;		//秒
		int seconds = 256559;

		System.out.println( seconds +"秒 =" + 
		seconds/day +"天" + seconds%day/hr+"時" + seconds%hr/min+"分"+ seconds%min+"秒");
	}

}
