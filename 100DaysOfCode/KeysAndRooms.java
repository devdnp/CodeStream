import java.util.Arrays;
import java.util.List;

public class KeysAndRooms {
    static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] seen = new int[rooms.size()];
        dfs(rooms, 0, seen);
        return Arrays.stream(seen).allMatch(a -> a == 1);
    }

    private static void dfs(List<List<Integer>> rooms, int node, int[] seen) {
        seen[node] = 1;
        for (final int child : rooms.get(node))
            if (seen[child] == 0)
                dfs(rooms, child, seen);
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(Arrays.asList(1,3),
                Arrays.asList(3,0,1),
                Arrays.asList(2),Arrays.asList(0));
        System.out.println(canVisitAllRooms(rooms));
    }
}
