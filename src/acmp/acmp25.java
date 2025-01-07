package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp25 {
	void solve(Scanner in, PrintWriter out) {

		int i = in.nextInt();
		int b = in.nextInt();

		if (i < b) {
			out.print("<");
		} else if (i > b) {
			out.print(">");
		} else {
			out.print("=");
		}
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp25().run();
	}
}
