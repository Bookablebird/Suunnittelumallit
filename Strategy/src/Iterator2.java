import java.util.List;
import java.util.ListIterator;

public class Iterator2 implements IStrategy{

	@Override
	public String listToString(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		String listString ="";
		int l = 0;


		while(iterator.hasNext()) {
			l++;
			
			if(l %2 == 0){
				listString += iterator.next()+"\n";
			}
			
			else{
				listString += iterator.next();
			}
		}


		return listString;
	}

}