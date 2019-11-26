import java.util.ArrayList;
import java.util.List;

public class McDonalds implements IBurgerBuilder {

	private List<IBurger> tuplajuusto;

	public McDonalds() {
		tuplajuusto = new ArrayList<>();
	}

	@Override
	public void Sampyla() {
		tuplajuusto.add(new Sampyla("Leipä"));
	}

	@Override
	public void Juusto() {
		tuplajuusto.add(new Juusto("Juusto x2"));
	}

	@Override
	public void Suolakurkku() {
		tuplajuusto.add(new Suolakurkku("Suolakurkku x2"));
	}
	
	@Override
	public void Ketsuppi() {
		tuplajuusto.add(new Ketsuppi("Ketsuppi"));
	}

	@Override
	public void Pihvi() {
		tuplajuusto.add(new Pihvi("Hk halppis pihvi"));
	}

	@Override
	public Object getBurger() {
		return tuplajuusto;
	}
}