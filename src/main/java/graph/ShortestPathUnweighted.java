package graph;

/**
 * 题目目标：在无权无向图中求从起点到各点的最短距离。
 *
 * <p>输入：顶点数 vertexCount、起点 start、边数组 edges。每条边格式为 {u, v}。</p>
 * <p>输出：距离数组，dist[i] 表示 start 到 i 的最少边数，不可达为 -1。</p>
 * <p>异常：顶点数为负、起点越界、边数组为 null、边端点越界时抛出 IllegalArgumentException。</p>
 */
public final class ShortestPathUnweighted {
    private ShortestPathUnweighted() {
    }

    public static int[] distances(int vertexCount, int start, int[][] edges) {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }
}
