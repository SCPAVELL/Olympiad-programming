package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp1116 {
	void solve(Scanner in, PrintWriter out) {
		int c1 = in.nextInt();
		int m1 = in.nextInt();
		int s1 = in.nextInt();
		int c2 = in.nextInt();
		int m2 = in.nextInt();
		int s2 = in.nextInt();
		int time1 = c1 * 3600 + m1 * 60 + s1;
		int time2 = c2 * 3600 + m2 * 60 + s2;
		out.println(time2 - time1);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp1116().run();
	}
}
