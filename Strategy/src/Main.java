public class Main {
	public static void main(String[] args) {

		Sysout test = new Sysout(new List1());
		test.printString();
		
		test = new Sysout(new Iterator2());
		test.printString();
		
		System.out.println(" ");
		
		test = new Sysout(new Table3());
		test.printString();
	}
}