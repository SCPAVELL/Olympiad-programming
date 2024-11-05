package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp263 {
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int i = in.nextInt();
		int j = in.nextInt();
		if (i < j) {
			out.println(j - i);
		} else {
			out.println(j + (n - i));
		}

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp263().run();
	}
}
