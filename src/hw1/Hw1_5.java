//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//請用程式計算10年後，本金加利息共有多少錢
//複利計算公式
//本利和 = 本金 × (1 + 年利率) ^ 期間

package hw1;

public class Hw1_5 {
  public static void main(String[] args) {
	  double money = 1500000, annualRate = 0.02, period = 10; 
	  
	  double totalMoney = money*Math.pow(1+annualRate,period);
	  System.out.println("本金+利息="+totalMoney);
  }
}

