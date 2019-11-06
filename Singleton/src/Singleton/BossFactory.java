package Singleton;

import java.util.ArrayList;
import java.util.List;

public class BossFactory implements IFactory{
	private static BossFactory INSTANCE = null;

	private BossFactory(){}
	public static BossFactory getInstance(){
		if(INSTANCE == null){
			synchronized(BossFactory.class){
				if(INSTANCE == null){
			INSTANCE = new BossFactory();
			}
			}
		}
		return INSTANCE;
	}

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