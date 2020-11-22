package javafortesters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainobject.User;

public class Datatypes_Test {

	//Arrays
	//@Test
	public void simpleArrayExample() {
		String[] friends = {"Bob", "Dylan","Elena", "Ryan"};
		for(String myfriend : friends) {
			System.out.println(myfriend);
		}
		assertEquals("Bob",friends[0]);
		
		String allfriends = "";
		for(int i=0; i<4; i++) {
			allfriends = allfriends + "|" + friends[i];
		}
		assertEquals("|Bob|Dylan|Elena|Ryan",allfriends);
	}
	
	//@Test
	public void createArrayOf100Users() {
		User[] users = new User[100];
		int userID = 0;
		for(int i=0;i<100;i++) {
			userID = i+1;
			users[i] = new User("username" + userID, "password" + userID);
		}
		for(User curUser:users) {
			System.out.println(curUser.getUsername() + "&" + curUser.getPassword());
		}
		userID=1;
		for(User curUser:users) {
			assertEquals("username"+userID,curUser.getUsername());
			userID++;
		}
	}
	
	public void create2DArray() {
		int[][] twoDArray = new int[5][];
		int i,j, count=0;
		for(i=0;i<=5;i++) {
			count = i+1;
			twoDArray[i] = new int[count];
			for(j=0;j<count;j++) {
				
				twoDArray[i][j] = j;
				System.out.print(twoDArray[i][j]+",");
			}
			System.out.println("");
		}
	}
	@Test
	public void arrayTest() {
		create2DArray();
	}
}
