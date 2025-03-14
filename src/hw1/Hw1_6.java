//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因


package hw1;

public class Hw1_6 {
	public static void main(String[] args) {
		System.out.println(5+5);// 都是int資料型態，直接相加運算
		System.out.println(5+'5'); //5+53=58  char'5'型別轉換成ASCII(53)，再相加計算
		System.out.println(5+"5"); // 數字+文字，數字轉成文字串接
			}
}
