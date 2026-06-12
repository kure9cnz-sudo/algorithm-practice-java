package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShortestPathUnweightedTest {
    @Test
    void distancesShouldReturnMinimumEdgeCountsFromStart() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}};

        assertArrayEquals(new int[]{0, 1, 1, 2, 2, 2}, ShortestPathUnweighted.distances(6, 0, edges));
    }

    @Test
    void distancesShouldMarkUnreachableVerticesAsMinusOne() {
        int[][] edges = {{0, 1}, {2, 3}};

        assertArrayEquals(new int[]{0, 1, -1, -1}, ShortestPathUnweighted.distances(4, 0, edges));
    }

    @Test
    void distancesShouldHandleSingleVertexGraph() {
        assertArrayEquals(new int[]{0}, ShortestPathUnweighted.distances(1, 0, new int[0][0]));
    }

    @Test
    void distancesShouldHandleCycleWithoutInfiniteLoop() {
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};

        assertArrayEquals(new int[]{0, 1, 1}, ShortestPathUnweighted.distances(3, 0, edges));
    }

    @Test
    void distancesShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> ShortestPathUnweighted.distances(-1, 0, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> ShortestPathUnweighted.distances(3, 3, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> ShortestPathUnweighted.distances(3, 0, null));
        assertThrows(IllegalArgumentException.class, () -> ShortestPathUnweighted.distances(3, 0, new int[][]{{0, 3}}));
        assertThrows(IllegalArgumentException.class, () -> ShortestPathUnweighted.distances(3, 0, new int[][]{{0}}));
    }
}
