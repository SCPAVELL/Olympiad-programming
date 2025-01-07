package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp149 {
	void solve(Scanner in, PrintWriter out) {

		int n = in.nextInt();
		int[] sequence = new int[n];

		for (int i = 0; i < n; i++) {
			sequence[i] = in.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
			out.print(sequence[i]);
			if (i > 0) {
				System.out.print(" ");
			}
		}
		in.close();

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp149().run();
	}
}