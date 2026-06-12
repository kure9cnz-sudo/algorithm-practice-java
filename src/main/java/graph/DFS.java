package graph;

import java.util.List;

/**
 * 题目目标：在无向图上实现深度优先搜索。
 *
 * <p>输入：顶点数 vertexCount、起点 start、边数组 edges。每条边格式为 {u, v}。</p>
 * <p>输出：从 start 出发的 DFS 先序访问顺序。邻接点按顶点编号从小到大访问。</p>
 * <p>异常：顶点数为负、起点越界、边数组为 null、边端点越界时抛出 IllegalArgumentException。</p>
 */
public final class DFS {
    private DFS() {
    }

    public static List<Integer> traverse(int vertexCount, int start, int[][] edges) {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }
}
