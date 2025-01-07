package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp754 {
	void solve(Scanner in, PrintWriter out) {

		int i = in.nextInt();
		int b = in.nextInt();
		int s = in.nextInt();
		int max = Math.max(Math.max(i, b), s);
		int min = Math.min(Math.min(i, b), s);

		out.print(max > 727 || min < 94 ? "Error" : max);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp754().run();
	}
}
