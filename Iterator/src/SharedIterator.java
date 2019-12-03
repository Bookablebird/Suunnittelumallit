import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharedIterator {

	private List<Integer> list;
	private Iterator<Integer> iterator;

	public SharedIterator(int n) throws InterruptedException {
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		iterator = list.iterator();
		Shared shared1 = new Shared();
		Shared shared2 = new Shared();
		
		shared1.start();
		shared2.start();
		
		shared1.join();
		shared2.join();
	}

	public synchronized void iterate(Shared shared) {
		try {
			System.out.println(shared.getName() + ": "+ iterator.next());
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private class Shared extends Thread {
		@Override
		public void run() {
			while (iterator.hasNext()) {
				try {
					iterate(this);
					Thread.sleep(200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}