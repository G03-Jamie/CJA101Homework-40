package hw5;

public class MyRectangle {
	
	private double width;
	private double depth;
	private double rectangle;

	//(1) 有兩個double型態的屬性為width, depth
	//(2) 有三個方法：
	//default (相同套件裡的class都可以用)
	
	void setWidth(double width) {  //將收到的參數指定給width屬性
		this.width = width; }
	
	void setDepth(double depth) {  //將收到的參數指定給width屬性
		this.depth = depth; } 
	
	
	double getArea() {
		double rectangle = width * depth;
		return rectangle;
	}           //能計算該長方形的面積
		
		
	//(3) 有兩個建構子：
		//不帶參數也無內容的建構子
		public MyRectangle() {}
		
			
			
		//傳入的兩個參數會指定給對應的屬性
		public MyRectangle(double width, double depth) {
			this.width = width;
			this.depth = depth;
		}
		
		
}
