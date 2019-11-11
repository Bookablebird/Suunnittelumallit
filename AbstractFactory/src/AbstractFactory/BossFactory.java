package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class BossFactory implements IFactory{

	@Override
	public List<IVaate> vaatteet() {
		List<IVaate> vaatteet= new ArrayList<IVaate>();
		vaatteet.add(new Vaate("Farmarit", "Boss"));
		vaatteet.add(new Vaate("T-paita", "Boss"));
		vaatteet.add(new Vaate("Lippis", "Boss"));
		vaatteet.add(new Vaate("Kengät", "Boss"));
		return vaatteet;
	}

}