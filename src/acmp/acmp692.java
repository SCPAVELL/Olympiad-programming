package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp692 {
	void solve(Scanner in, PrintWriter out) {

		int n = in.nextInt();

		out.print(n > 0 && (n & n - 1) == 0 ? "YES" : "NO");

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp692().run();
	}
}