package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp1114 {
	void solve(Scanner in, PrintWriter out) {
		int v = in.nextInt();
		int t = in.nextInt();
		int x = ((v * t + 109) % 109 + 109) % 109;

		out.println(x + 1);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp1114().run();
	}
}
