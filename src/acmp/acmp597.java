package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp597 {
	void solve(Scanner in, PrintWriter out) {

		int r1 = in.nextInt();
		int r2 = in.nextInt();
		int r3 = in.nextInt();

		out.print(r1 >= r2 + r3 ? "YES" : "NO");
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp597().run();
	}
}