package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp554 {
	void solve(Scanner in, PrintWriter out) {
		int i = in.nextInt();
		out.print(1 + (i + 1) * i / 2);
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp554().run();
	}
}
