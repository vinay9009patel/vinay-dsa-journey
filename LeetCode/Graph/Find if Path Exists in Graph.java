class Solution {

    public boolean validPath(int n, int[][] edges,
                             int source,
                             int destination) {

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(graph, source, destination, visited);
    }

    boolean dfs(List<Integer>[] graph,
                int source,
                int destination,
                boolean[] visited) {

        if (source == destination) {
            return true;
        }

        visited[source] = true;

        for (int neighbour : graph[source]) {

            if (!visited[neighbour]) {

                if (dfs(graph,
                        neighbour,
                        destination,
                        visited)) {

                    return true;
                }
            }
        }

        return false;
    }
}
