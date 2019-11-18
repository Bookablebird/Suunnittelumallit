import java.util.List;

public class List1 implements IStrategy{


		@Override
		public String listToString(List<String> list) {

			String listString = "";
			for (String s : list) {
				listString += s + "\n";
			}
			return listString;
		}

}