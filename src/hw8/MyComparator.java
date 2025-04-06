package hw8;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyComparator implements Comparator<Train>{
	public int compare(Train t1, Train t2) {
		return t1.compareTo(t2) * -1;
	}

}
