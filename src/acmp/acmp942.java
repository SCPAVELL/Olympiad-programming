package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp942 {
	void solve(Scanner in, PrintWriter out) {

		long i;
		try {
			i = in.nextInt();
		} catch (Exception e) {
			i = 0;
		}

		int almostReadyTasks;
		try {
			almostReadyTasks = in.nextInt();
		} catch (Exception e) {
			almostReadyTasks = 0;
		}

		long s = i + almostReadyTasks;
		System.out.print(s);
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp942().run();
	}
}
