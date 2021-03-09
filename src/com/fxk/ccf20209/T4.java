package com.fxk.ccf20209;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
		
		int n,m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		Graph graph = new Graph(m);
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			
			graph.insert(start, end, weight, i);
		}

        
		
		
		sc.close();

		
		

	}

}

class Graph{
	
	Edge[] edges;
	
	

	public Graph() {
		super();
	}



	public Graph(int m) {
		edges = new Edge[m];
	}
	
	public void insert(int start,int end,int weight,int index) {
		edges[index] = new Edge(start, end, weight);
	}
	
	
	
}

class Edge{
	int start;
	int end;
	
	int weight;
	
	public Edge(int start,int end,int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
}
