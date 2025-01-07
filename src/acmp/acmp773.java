package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp773 {

	void solve(Scanner in, PrintWriter out) {

		int i = in.nextInt();
		int b = in.nextInt();
		int totalMattrasses = (int) Math.pow(i, 2) * b;
		out.print(totalMattrasses);
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp773().run();
	}
}