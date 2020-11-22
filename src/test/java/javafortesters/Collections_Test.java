package javafortesters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Collections_Test {

	
	public void loop_test() {
		int nameIndex=0;
		String[] names = {"John","Muriel","Jas","Chan"};
		
		System.out.println("foreach:");
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("for:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("do..while:");
		do {
			System.out.println(names[nameIndex]);
			nameIndex++;
		}while(nameIndex<names.length);
		
		nameIndex=0;
		System.out.println("while:");
		while(nameIndex<names.length) {
			System.out.println(names[nameIndex]);
			nameIndex++;
		}
	}
	
	/*Collection interfaces - 
	 * Collections - a generic collection where you can add objects, 
	 * Set - a collection that does not allow duplicates, 
	 * List - a collection where you can add/delete objects from specific locations, 
	 * Map - key value pairs */
	
	
	public void collection_test() {
		Collection anything;	//can contain any type of object
		anything = new ArrayList(); //could use ArrayList or LinkedList or HashSet
		anything.add("Sunday");
		anything.add(567);
		
		Collection<String> weekdays = new ArrayList<String>();
		weekdays.add("Monday");
		weekdays.add("Funday");
		System.out.println(weekdays);
		assertEquals(2,weekdays.size());
		weekdays.remove("Funday");
		System.out.println(weekdays);
		assertFalse(weekdays.contains("Funday"));
		weekdays.add("Sunday");
		assertTrue("Bug not fixed", weekdays.contains("Sunday"));
		
		//Iterate with for each
		for(String day: weekdays) {
			System.out.println(day);
		}
		
		//weekdays.clear();
		//assertTrue(weekdays.isEmpty());
		
		//Converting to array
		Object[] arrweekdays = weekdays.toArray();
		assertEquals("Not equal",2,arrweekdays.length);
	}
	
	
	public void list_test() {
		List<String> friends = new ArrayList<String>();
		friends.add("Omni");
		friends.add(0,"Pael");
		friends.add(2,"Myna");
		System.out.println(friends);
	}
	
	
	public void set_test() {
		Set workdays = new HashSet();
		workdays.add("Monday");
		workdays.add("Monday");
		assertEquals(1,workdays.size());
	}
	
	@Test
	public void map_test() {
		Map<String, String> mymap = new HashMap<String, String>();
		mymap.put("first","India");
		mymap.put("second", "Shanghai");
		mymap.put("third", "Australia");
		System.out.println(mymap.size());
		System.out.println(mymap.get("third"));
		
		Collection<String> countries = mymap.values();
		System.out.println(countries);
		
		Set<String> mykeys = mymap.keySet();
		System.out.println(mykeys);
	}
}
