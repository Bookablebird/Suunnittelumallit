import java.util.List;

public class Table3 implements IStrategy{

	@Override
	public String listToString(List<String> list) {
		
		String listString ="";
		String[] table = new String[list.size()];
		
		
		for(int i = 0; i<list.size(); i++) {
			table[i]=list.get(i);
		}

		for(int i = 0; i<table.length; i++) {
			listString += table[i];
			if((i+1) %3 == 0) {
				listString+="\n";
			}
		}
		return listString;
	}

}