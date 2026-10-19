package Assignment8_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private int vertexcount;
	private int edgeCount;
	private LinkedList<Integer>[] adjMat;
	
	public Graph(int vcount) {
		vertexcount = vcount;
		adjMat = new LinkedList[vertexcount];
		for(int i = 0 ; i < vertexcount ; i++) {
			adjMat[i] = new LinkedList<>();
		}
	}
	public void accept(Scanner sc) {
		System.out.println("Enter the edge count");
		edgeCount = sc.nextInt();
		System.out.println("Enter the edges : (src , dest) : ");
		for(int i =0;i<edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjMat[src].add(dest);
			adjMat[dest].add(src);
		}
	}
	public void print() {
		System.out.println("Graph : ");
		System.out.println("Vertex count : " + vertexcount);
		System.out.println("Edge count : " + edgeCount);
		System.out.println("Adjacency Matrix : ");
		for (int u = 0; u < vertexcount; u++) {
            System.out.print(u + " -> ");
            for (int v : adjMat[u]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
	}
	public void DFSTraversal(int start) {
		Stack<Integer> s = new Stack<>();
		boolean marked[] = new boolean[vertexcount];
		s.push(start);
		marked[start]=true;
		System.out.println("DFS traversal");
		while(!s.isEmpty()) {
			int u = s.pop();
			System.out.print(" "+ u);
			 for (int v : adjMat[u]) {
	                if (!marked[v]) {
					s.push(v);
					marked[v] = true;
				}
			}
		}
		System.out.println();
	}
	
	public void BFSTraversal(int start) {
		Queue<Integer> s = new LinkedList<>();
		boolean marked[] = new boolean[vertexcount];
		s.offer(start);
		marked[start]=true;
		System.out.println("BFS traversal");
		while(!s.isEmpty()) {
			int u = s.poll();
			System.out.print(" "+ u);
			 for (int v : adjMat[u]) {
	                if (!marked[v]) {
					s.offer(v);
					marked[v] = true;
				}
			}
		}
		System.out.println();
	}
}
