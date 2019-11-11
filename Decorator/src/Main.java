
public class Main {
	public static void main(String[] args) {

		IPizzeria pizza = (new Pina(new Ham(new Cheese(new Base()))));
		IPizzeria pizza1 = (new Bacon(new Ham(new Chicken(new Cheese(new Base())))));
		IPizzeria pizza2= new Bacon(new Chicken(new Ham(new Pina(new Pepperoni(new Cheese(new Base()))))));
		
		
		System.out.println("Price: "+pizza.getPrice()+"€ "+ pizza.getDescription().substring(0, pizza.getDescription().length()-2));
		System.out.println("Price: "+pizza1.getPrice()+"€ "+ pizza1.getDescription().substring(0, pizza1.getDescription().length()-2));
		System.out.println("Price: "+pizza2.getPrice()+"€ "+ pizza2.getDescription().substring(0, pizza2.getDescription().length()-2));

	}
}
