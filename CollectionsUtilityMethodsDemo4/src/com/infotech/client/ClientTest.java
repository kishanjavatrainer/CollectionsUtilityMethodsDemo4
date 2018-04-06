package com.infotech.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		
		List<Integer> intList1 = new ArrayList<>();
		intList1.add(100);
		intList1.add(200);
		intList1.add(300);
		intList1.add(400);
		
		System.out.println("Original  content of intList1:::"+intList1);
		
		/*1.Swaps the elements at the specified positions in the specified list.
	      (If the specified positions are equal, invoking this method leaves
	     the list unchanged.)*/
		Collections.swap(intList1, 0, 3);
		System.out.println("After calling swap intList1 content::"+intList1);
		
		//2.Replaces all of the elements of the specified list with the specified element.
		Collections.fill(intList1, 2000);
		System.out.println("After calling fill intList1 content::"+intList1);
		
		List<Integer> intList2 = new ArrayList<>();
		intList2.add(5000);
		intList2.add(50000);
		System.out.println("Original  content of intList2:::"+intList2);
		//Collections.copy(intList2, intList1);//this will throw java.lang.IndexOutOfBoundsException: Source does not fit in dest at runtime
		//3.Copies all of the elements from one list into another
		Collections.copy(intList1, intList2);
		
		System.out.println("After calling copy content of intList1 and intList2::::");
		System.out.println("intList1:::"+intList1);
		System.out.println("intList2:::"+intList2);
		
		List<String> personList = new ArrayList<>();
		personList.add("Sam");
		personList.add("Andy");
		personList.add("Sean");
		personList.add("Jash");
		personList.add("Amy");
		personList.add("Martin");
		personList.add("Joseph");
		personList.add("Amy");
		
		//4.Returns the minimum element of the given collection
		System.out.println("Min element of personList: "+Collections.min(personList));
		//4.Returns the maximum element of the given collection
		System.out.println("Max element of personList: "+Collections.max(personList));
		
	}
}
