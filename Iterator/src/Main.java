import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		boolean end = false;
		
		while (!end) {
			System.out.println("\n1. a) Tutki kuinka Javan iteraattori k‰ytt‰ytyy, jos yritet‰‰n iteroida kokoelmaa kahdella s‰ikeell‰ yht‰ aikaa, kun molemmilla on oma iterattori.\n" +
								"2. b) Ent‰, jos s‰ikeet k‰ytt‰v‰t samaa iteraattoria vuorotellen?\n" +
								"3. c) Kuinka k‰y, jos kokoelmaan tehd‰‰n muutoksia iteroinnin l‰pik‰ynnin aikana.\n" +
								"4. d) Keksi jotain muuta testattavaa.\n" +
								"5. Lopeta.");
			
			int i = s.nextInt();
			
				switch (i) {
					case 1:
						Iterators2 eka = new Iterators2(20);
						break;
					case 2:
						SharedIterator toka = new SharedIterator(20);
						break;
					case 3:
						RemoveIteration kolmas = new RemoveIteration(20);
						break;
					case 4:
						AddIterator nelj‰s = new AddIterator(20);
						break;
					case 5:
						end = true;
						break;
				}
		}
	}
}