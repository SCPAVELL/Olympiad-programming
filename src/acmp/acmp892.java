package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp892 {
	void solve(Scanner in, PrintWriter out) {

		int n = in.nextInt();

		if (n == 12 || n == 1 || n == 2) {
			out.print("Winter");
		} else if (n == 3 || n == 4 || n == 5) {
			out.print("Spring");
		} else if (n == 6 || n == 7 || n == 8) {
			out.print("Summer");
		} else if (n == 9 || n == 10 || n == 11) {
			out.print("Autumn");
		} else {
			out.print("Error");
		}
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp892().run();
	}
}