package hw8;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {
		MyComparator c = new MyComparator();

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		Set<Train> set = new TreeSet<>(c);
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		for (Train train : set) {
			System.out.print(train.getTrain());
			System.out.println();

//		PriorityQueue<Train> pq = new PriorityQueue<Train>(6, c);		
//		pq.offer(t1);
//		pq.offer(t2);
//		pq.offer(t3);
//		pq.offer(t4);
//		pq.offer(t5);
//		pq.offer(t6);
//		pq.offer(t7);

//		while(!pq.isEmpty()){
//			System.out.println(pq.poll());
//		}

//			Iterator objs = pq.iterator();
//			while (objs.hasNext())
//				System.out.println(objs.next());

		}

	}

}
