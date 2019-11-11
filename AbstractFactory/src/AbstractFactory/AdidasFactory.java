package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class AdidasFactory implements IFactory{

	@Override
	public List<IVaate> vaatteet() {
		List<IVaate> vaatteet= new ArrayList<IVaate>();
		vaatteet.add(new Vaate("Farmarit", "Adidas"));
		vaatteet.add(new Vaate("T-paita", "Adidas"));
		vaatteet.add(new Vaate("Lippis", "Adidas"));
		vaatteet.add(new Vaate("Kengät", "Adidas"));
		return vaatteet;
	}
}