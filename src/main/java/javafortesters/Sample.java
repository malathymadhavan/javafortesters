package javafortesters;

public class Sample {
	
	private String name;
	private int A, B;
	
	public Sample(String myName, int first, int second) {
		name =myName;
		A = first;
		B = second;
	}

	public void printMyName() {
		System.out.println("My name is " + name);
	}
	
	public int subtractNumbers() {
		return A - B;
	}
	
	public int multiplyNumbers() {
		return A * B;
	}
}
