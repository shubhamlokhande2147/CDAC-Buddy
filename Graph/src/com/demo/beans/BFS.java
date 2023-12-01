package com.demo.beans;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {
	public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}
		visited[src] = true;
		dist[src] = 0;
		queue.add(src);

		while (!queue.isEmpty()) {
			int curr = queue.remove();
			for (int i = 0; i < adj.get(v).size(); i++) {
				int neighbor = adj.get(v).get(i);
				if (visited[neighbor] == false) {
					visited[neighbor] = true;
					dist[neighbor] = dist[curr] + 1;
					pred[neighbor] = curr;
					queue.add(neighbor);
					if (neighbor == dest) {
						return true;
					}
				}
			}

		}
		return false;
	}

}
