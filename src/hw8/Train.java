package hw8;

import java.util.HashSet;
import java.util.Set;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
	};

	public Train(int number, String type, String start, String dest, int price) {
		setTrain(number, type, start, dest, price);
	}

	public void setTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public String toString() {
		return getTrain();
	}

	public String getTrain() {
		return number + "," + type + "," + start + "," + dest + "," + price;
	}

	public int compareTo(Train t) {
		if (this.number > t.number) {
			return 1;
		} else if (this.number == t.number) {
			return 0;
		} else {
			return -1;
		}

	}

	// equals的override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if (this.number == t.number && this.type.equals(t.type)) {
				return true;
			}

		}
		return false;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1; // 起始值不可為0 相乘都是0
		result = result * prime + number; // 物件的屬性和名子(java內部寫好字串的hashcode)加進來算
		result = result * prime + (type == null ? 0 : type.hashCode());
		return result;
	}

}
