import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PossibleBipartition {
    public static void main(String[] args) {
        int n = 5;
        int[][] dislikes = {{1, 2},{2, 3},{3, 4},{4, 5},{1, 5}};
        System.out.println(possibleBipartitionProcess(n, dislikes));
    }

    static boolean possibleBipartitionProcess(int n, int[][] dislikes) {
        int[] color = new int[n + 1];
        List<List<Integer>> adj = new ArrayList<>(n + 1);
        for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
        for(int[] d : dislikes) {
            adj.get(d[0]).add(d[1]);
            adj.get(d[1]).add(d[0]);
        }

        for(int i = 1; i <= n; i++) {
            if(color[i] == 0) {
                color[i] = 1;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while(!q.isEmpty()) {
                    int cur = q.poll();
                    for(int nb : adj.get(cur)) {
                        if(color[nb] == 0) {
                            color[nb] = color[cur] == 1 ? 2 : 1;
                            q.add(nb);
                        } else {
                            if(color[nb] == color[cur]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
