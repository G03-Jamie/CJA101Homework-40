
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數

package hw3;

import java.util.Scanner;




public class Hw3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入不想要的數字(1~9)");
	    
		int keyIn = sc.nextInt(); //讀取不想要的數字
		
		int[][] data1 = getNumber(keyIn);
		//呼叫getNumber()方法，將int keyIn資料傳入方法後，回傳一個 int 的二維陣列 data，存入data1
		printArray(data1); //呼叫printArray()方法，將data1陣列傳入方法變數data3，印出號碼
		
	}	
	
	//==================================================================
	
		//keyIn資料傳入getNumber並返回一個 7x7 的int二維陣列
    public static int[][] getNumber(int keyIn) {
        int[][] data = new int[7][7]; //創一個陣列初始值為0的二為陣列，變數 data 指向這個陣列的記憶體位置。
        int num = 1; // 用來填充數字的變數
        
        // 填充 1 到 49 的數字，並排除不想要的數字
        outer: 
        for (int i = 0; i < data.length; i++) { //獲取data陣列的行數
            for (int j = 0; j < data[i].length; j++) { //獲取data第i行裡的元素個數
                // 如果當前數字是要排除的數字，則跳過
                while (num % 10 == keyIn ||  (keyIn * 10 <= num) && (num < keyIn * 10 + 10)) {
                    num++;
                    continue;
                }
                if(num > 49) {
               	
                break outer;
                }
                data[i][j] = num;  // 填入數字
              
                num++;  // 增加數字
                
            }
        }
  
        return data;  // 返回填充好的數字陣列
    }
    
    // 列印 7x7 數字陣列
    public static void printArray(int[][] data3) {
    	int count = 0;
        for (int i = 0; i < data3.length; i++) {
            for (int j = 0; j < data3[i].length; j++) {
            	if(data3[i][j] > 0) {
            	count++;
                System.out.print(data3[i][j] + "\t");}
            	else  {System.out.print("總共有" + count + "個數字可以選");
            	break;}
          
            }
            
            System.out.println();
         
        }
       
    }
        
}

