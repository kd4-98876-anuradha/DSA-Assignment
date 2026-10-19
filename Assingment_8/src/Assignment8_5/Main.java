package Assignment8_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter vertex count : ");
		int count = sc.nextInt();
		Graph g = new Graph(count);
		g.accept(sc);
		g.print();
		g.DFSTraversal(4);
		g.BFSTraversal(4);
		sc.close();
	}

}
