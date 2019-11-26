import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Burger burger = new Burger();
		Scanner s = new Scanner(System.in);
		int i = -1;

		
		while (i != 0) {
			System.out.println("1 for Hesburger, 2 for McDonalds. (insert any other number to exit)\n");

			i = s.nextInt();
			
			switch (i) {
				case 1:
					IBurgerBuilder hesburger = new Hesburger();
					
					burger.setBurgerBuilder(hesburger);
					burger.rakennaBurger();
					
					StringBuilder kerroshampurilainen = (StringBuilder) burger.getBurger();
					System.out.println(kerroshampurilainen.toString());
					break;

				case 2:
					IBurgerBuilder mcDonalds = new McDonalds();
					
					burger.setBurgerBuilder(mcDonalds);
					burger.rakennaBurger();
					
					List<IBurger> tuplajuusto = (List) burger.getBurger();
					tuplajuusto.stream().forEach(part -> System.out.println(part.toString()));
					break;

				default:
					System.exit(0);			
			}
		}
	}
}