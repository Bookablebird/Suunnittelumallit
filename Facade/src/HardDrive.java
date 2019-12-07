import java.util.Random;

public class HardDrive {

	private byte[] data;

	public byte[] read(long lba, int size) {
		System.out.println("Reading data from hard drive... Sector " + lba + "....\n");
		data = new byte[size];
		Random r = new Random();
		r.nextBytes(data);
		return data;
	}
}