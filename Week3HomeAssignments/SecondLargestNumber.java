package Week3HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers= {3,2,11,4,6,7};
		List<Integer>numberlist=new ArrayList<Integer>();
		//convert the array to a list
		for(int num:numbers) {
			numberlist.add(num);
			
		}
		Collections.sort(numberlist);
		System.out.println(numberlist.get(1));
		
		//if(numberlist.size()>=2) {
			//int secondLargest=numberlist.get(5);
			//System.out.println("Second largest Number is:"+numberlist);
			
		//	}
		//else {
			//System.out.println("No largest number is found:");
		}
	}

