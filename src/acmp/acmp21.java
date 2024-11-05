package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp21 {
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();
		int b = in.nextInt();
		int s = in.nextInt();
		int max = Math.max(Math.max(a, b), s);
		int min = Math.min(Math.min(a, b), s);
		out.println(max - min);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp21().run();
	}
}
