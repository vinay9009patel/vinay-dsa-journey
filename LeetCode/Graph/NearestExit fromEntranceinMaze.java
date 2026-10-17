
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {

        int row = maze.length;
        int col = maze[0].length;

        Queue<int[]> q = new ArrayDeque<>();

        q.add(entrance);

        maze[entrance[0]][entrance[1]] = '+';

        int[][] direction = {
            {0, 1},
            {1, 0},
            {-1, 0},
            {0, -1}
        };

        int steps = 0;

        while (!q.isEmpty()) {
            steps++;

            int n = q.size();

            for (int i = 0; i < n; i++) {

                int[] arr = q.remove();

                for (int dir = 0; dir < direction.length; dir++) {

                    int x = arr[0] + direction[dir][0];
                    int y = arr[1] + direction[dir][1];

                    if (x < 0 || x >= row || y < 0 ||
                        y >= col || maze[x][y] == '+')
                        continue;

                    if (x == 0 || x == row - 1 ||
                        y == 0 || y == col - 1)
                        return steps ;

                    maze[x][y] = '+';

                    q.add(new int[]{x, y});
                }
            }

        }

        return -1;
    }
}
