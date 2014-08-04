import java.util.*;

public class projec3 {

	private ArrayList<ArrayList<Integer>> succ;
	private ArrayDeque<Integer> queue;
	private ArrayList<Integer> sd;
	private ArrayList<Integer> ce;
	private int predecount[];
	
	
	private int k;
	private int b;
	private int p;

	projec3(int max) {
		k = max;
		predecount = new int[max + 1];

		succ = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < max + 1; i++) {
			succ.add(new ArrayList<Integer>());
		}

		queue = new ArrayDeque<Integer>();
		sd = new ArrayList<Integer>();
		ce = new ArrayList<Integer>();
	}

	// --Methods
	public void increment(int i, int j) {
		System.out.println("increment(" + i + "," + j + ")");

		b = predecount[j];
		predecount[j] = (b + 1);
		System.out.println("predecount[" + j + "]=" + predecount[j]);

		succ.get(i).add(j);
		System.out.println("succ[" + i + "]=" + succ.get(i));
	}

	public void sort() {
		for (int i = 1; i <= k; i++) {
			if (predecount[i] == 0) {
				queue.add(i);
			}
		}
		System.out.println("queue=" + queue);

		while (queue.size() != 0) {
			int r = queue.getFirst();
			remove(r);

			if (predecount[r] == 0) {
				int s = succ.get(r).size();
				for (int i = 0; i < s; i++) {
					p = succ.get(r).get(i);
					predecount[p] = predecount[p] - 1;

					if (predecount[p] == 0) {
						System.out.println("add    " + p);
						queue.add(p);
					}
				}
			}
			if (queue.size() != 0) {
				System.out.println("queue=" + queue);
			}
		}
		if (sd.size() != k) {
			for (int i = 1; i <= k; i++) {
				if (sd.indexOf(i) == -1) {
					ce.add(i);
				}
			}
		}
	}

	private void remove(int j) {
		System.out.println("remove " + j);

		queue.removeFirst();
		sd.add(j);
	}

	public ArrayList<Integer> sd() {
		return sd;
	}

	public ArrayList<Integer> ce() {
		return ce;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= k; i++) {
			sb.append(i + " " + predecount[i] + " " + succ.get(i) + "\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		projec3 ts = null;
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			if (i == 0)
				ts = new projec3(j);
			else
				ts.increment(i, j);

		}

		System.out.println(ts);
		ts.sort();
		System.out.println(ts.sd() + "" + ts.ce());

	}

}
