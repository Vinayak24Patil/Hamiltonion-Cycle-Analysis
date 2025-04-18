public class HamiltonianCycle {
    final int V = 5;
    int[] path;

    boolean isSafe(int v, int[][] graph, int[] path, int pos) {
        if (graph[path[pos - 1]][v] == 0) return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v) return false;
        return true;
    }

    boolean hamCycleUtil(int[][] graph, int[] path, int pos) {
        if (pos == V)
            return graph[path[pos - 1]][path[0]] == 1;

        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamCycleUtil(graph, path, pos + 1)) return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    boolean hamCycle(int[][] graph) {
        path = new int[V];
        for (int i = 0; i < V; i++) path[i] = -1;
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("No Hamiltonian cycle found.");
            return false;
        }

        printSolution(path);
        return true;
    }

    void printSolution(int[] path) {
        System.out.print("Hamiltonian Cycle: ");
        for (int v : path) System.out.print(v + " ");
        System.out.println(path[0]);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };

        HamiltonianCycle h = new HamiltonianCycle();
        h.hamCycle(graph);
    }
}
