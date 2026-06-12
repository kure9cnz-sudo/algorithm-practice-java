package graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DFSTest {
    @Test
    void traverseShouldVisitReachableVerticesByDepthFirstOrder() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}};

        assertEquals(List.of(0, 1, 3, 4, 2, 5), DFS.traverse(6, 0, edges));
    }

    @Test
    void traverseShouldOnlyVisitConnectedComponent() {
        int[][] edges = {{0, 1}, {2, 3}};

        assertEquals(List.of(2, 3), DFS.traverse(4, 2, edges));
    }

    @Test
    void traverseShouldHandleSingleVertexGraph() {
        assertEquals(List.of(0), DFS.traverse(1, 0, new int[0][0]));
    }

    @Test
    void traverseShouldNotRepeatVerticesInCycle() {
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};

        assertEquals(List.of(0, 1, 2), DFS.traverse(3, 0, edges));
    }

    @Test
    void traverseShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> DFS.traverse(-1, 0, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> DFS.traverse(3, -1, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> DFS.traverse(3, 0, null));
        assertThrows(IllegalArgumentException.class, () -> DFS.traverse(3, 0, new int[][]{{0, 3}}));
        assertThrows(IllegalArgumentException.class, () -> DFS.traverse(3, 0, new int[][]{{0}}));
    }
}
