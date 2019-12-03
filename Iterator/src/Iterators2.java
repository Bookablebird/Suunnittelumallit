import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators2 {

	private List<Integer> list;

	public Iterators2(int n) throws InterruptedException {
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		IteratorThread iterator1 = new IteratorThread();
		IteratorThread iterator2 = new IteratorThread();
		
		iterator1.start();
		iterator2.start();
		
		iterator1.join();
		iterator2.join();
	}

	private class IteratorThread extends Thread {

		private Iterator<Integer> iterator;

		private IteratorThread() {
			iterator = list.iterator();
		}

		@Override
		public void run() {
			while (iterator.hasNext()) {
				try {
					System.out.println(this.getName() + ": "+ iterator.next());
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}