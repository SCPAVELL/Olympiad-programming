package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp766 {
	void solve(Scanner in, PrintWriter out) {

		int i = in.nextInt();
		int b = in.nextInt();
		int s = in.nextInt();

		out.print(i * b >= s ? "Yes" : "No");
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp766().run();
	}
}
