//班上有8位同學，他們進行了6次考試結果如下：請算出每位同學考最高分的次數
package hw4;

public class Hw4_4 {

	public static void main(String[] args) {
		
		
			int[][]data = { {10,35,40,100,90,85,75,70},
							{37,75,77,89,64,75,70,95},
							{100,70,79,90,75,70,79,90}, 
							{77,95,70,89,60,75,85,89}, 
						    {98,70,89,90,75,90,89,90},   
							{90,80,100,75,50,20,99,75}}; 
			
			
			int max = 0;
			int student1= 0;
			int student2= 0;
			int student3= 0;
			int student4= 0;
			int student5= 0;
			int student6= 0;
			int student7= 0;
			int student8= 0;
		    
		    
		   
			for(int row = 0; row < data.length; row++) {
				max = data [row][0];
				int cols = 0;
				for(int col = 0; col < data[row].length; col++) {
					
					if(data[row][col] > max) {
						max = data[row][col]; 
						cols = col;
					} 
		        }
				System.out.println("最大值:" + max + "在"+ row +"行" + cols+"列");
				
				if(cols == 0){
					student1++;}
				else if(cols == 1) {
					student2++;}
				else if(cols == 2) {
					student3++;}
				else if(cols == 3) {
					student4++;}
				else if(cols == 4) {
					student5++;}
				else if(cols == 5) {
					student6++;}
				else if(cols == 6) {
					student7++;}
				else if(cols == 7) {
					student8++;}
				}
			    System.out.println();
				System.out.println("1號學生考最高分次數:" + student1);
				System.out.println("2號學生考最高分次數:" + student2);
				System.out.println("3號學生考最高分次數:" + student3);
				System.out.println("4號學生考最高分次數:" + student4);
				System.out.println("5號學生考最高分次數:" + student5);
				System.out.println("6號學生考最高分次數:" + student6);
				System.out.println("7號學生考最高分次數:" + student7);
				System.out.println("8號學生考最高分次數:" + student8); 
				
						
						
					
				
				
			}
				
			
	}
       
