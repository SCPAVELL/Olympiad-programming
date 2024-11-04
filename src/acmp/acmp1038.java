package acmp;

import java.io.*;
import java.util.*;

public class acmp1038 {
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();
		int k = (a + 9) / 10;
		out.println(k);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp1038().run();
	}
}