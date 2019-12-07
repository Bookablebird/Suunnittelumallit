public class CPU {

	public void freeze() {
		System.out.println("CPU frozen...");
	}
	public void jump(long position) {
		System.out.println("CPU jumping into boot address... Address: " + position + "\n");
	}
	public void execute() {
		System.out.println("All systems up and running.");
	}

}