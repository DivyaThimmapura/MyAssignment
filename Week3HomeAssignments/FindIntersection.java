package Week3HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		//Create two lists of numbers
		List<Integer> list1 =new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(9);
		list1.add(7);
		List<Integer> list2 =new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		//Find the Intersection of the two lists
		List<Integer>intersection=new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		System.out.println("Intersection:"+intersection);
		
	}
}