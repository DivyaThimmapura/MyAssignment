package Week3HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class MissingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {1,2,3,4,10,6,8};
		//int expected_no_elements=a.length+1;
		//int total_sum=expected_no_elements*(expected_no_elements+1)/2;
		//int sum=0;
		List<Integer>originalValue=new ArrayList<Integer>();
		originalValue.add(1);
		originalValue.add(2);
		originalValue.add(3);
		originalValue.add(4);
		originalValue.add(10);
		originalValue.add(6);
		originalValue.add(8);
		List<Integer>finalValue=new ArrayList<Integer>();
		finalValue.add(1);
		finalValue.add(2);
		finalValue.add(3);
		finalValue.add(4);
		finalValue.add(5);
		finalValue.add(6);
		finalValue.add(7);
		finalValue.add(8);
		finalValue.add(9);
		finalValue.add(10);
		List<Integer>missingElements=new ArrayList<Integer>(finalValue);
		missingElements.removeAll(originalValue);
		System.out.println("missingElements:"+missingElements);
	}

}
