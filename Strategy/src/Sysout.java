import java.util.ArrayList;
import java.util.List;


public class Sysout {
    
    private List<String> list;
    private IStrategy strat;
	
    public Sysout(IStrategy strat) {
        this.list = new ArrayList<String>();
        this.strat = strat;
        
        this.list.add("M‰‰rittele ");
        this.list.add("Strategy-mallin ");
        this.list.add("mukaisesti ");
        this.list.add("ListConverter-rajapinta ");
        this.list.add("jossa ");
        this.list.add("m‰‰rritell‰‰n ");
        this.list.add("listToString-metodi ");
    }
	
    public void printString() {
        System.out.println(strat.listToString(list));
    }   
}