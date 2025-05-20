import java.util.*;

class AStarTSP {
    private final int n;
    private final int[][] graph;
    private final PriorityQueue<Node> pq;
    private final int INF = Integer.MAX_VALUE;

    public AStarTSP(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        this.pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.f));
    }

    static class Node {
        int city, g, f;
        List<Integer> path;

        Node(int city, int g, int f, List<Integer> path) {
            this.city = city;
            this.g = g;
            this.f = f;
            this.path = new ArrayList<>(path);
        }
    }

    private int heuristicCost(Set<Integer> visited) {
        int min = INF;
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                for (int j = 0; j < n; j++) {
                    if (i != j && !visited.contains(j)) {
                        min = Math.min(min, graph[i][j]);
                    }
                }
            }
        }
        return (min == INF) ? 0 : min;
    }

    public void solveTSP() {
        pq.add(new Node(0, 0, 0, new ArrayList<>(Arrays.asList(0))));


        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentCity = current.city;
            Set<Integer> visited = new HashSet<>(current.path);

            if (visited.size() == n) {
                int totalCost = current.g + graph[currentCity][0];
                current.path.add(0);
                System.out.println("Optimal Tour: " + current.path);
                System.out.println("Minimum Cost: " + totalCost);
                return;
            }

            for (int nextCity = 0; nextCity < n; nextCity++) {
                if (!visited.contains(nextCity)) {
                    List<Integer> newPath = new ArrayList<>(current.path);
                    newPath.add(nextCity);
                    int gNew = current.g + graph[currentCity][nextCity];
                    int hNew = heuristicCost(visited);
                    int fNew = gNew + hNew;

                    pq.add(new Node(nextCity, gNew, fNew, newPath));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        AStarTSP tsp = new AStarTSP(graph);
        tsp.solveTSP();
    }
}
