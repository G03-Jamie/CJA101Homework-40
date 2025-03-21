
//(提示：字元比對，String方法)
package hw4;

public class FindA {

	String s = "aeiou";
	String star1;
	
	
	public void setStar(String star) {
		this.star1 = star;
	}

	public int find() {
		int count = 0;
		
		for (int i = 0; i < star1.length(); i++) {
			for (int j = 0; j < 5; j++) {
				if (star1.charAt(i) == s.charAt(j)) {

					count++;
				}
			
			}
		}
		System.out.println(star1 + "母音數量是：" + count);
		return count;
		
	}
	


	
}