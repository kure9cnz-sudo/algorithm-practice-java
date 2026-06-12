package graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BFSTest {
    @Test
    void traverseShouldVisitReachableVerticesByBreadthFirstOrder() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}};

        assertEquals(List.of(0, 1, 2, 3, 4, 5), BFS.traverse(6, 0, edges));
    }

    @Test
    void traverseShouldOnlyVisitConnectedComponent() {
        int[][] edges = {{0, 1}, {2, 3}};

        assertEquals(List.of(0, 1), BFS.traverse(4, 0, edges));
    }

    @Test
    void traverseShouldHandleSingleVertexGraph() {
        assertEquals(List.of(0), BFS.traverse(1, 0, new int[0][0]));
    }

    @Test
    void traverseShouldNotRepeatVerticesInCycle() {
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};

        assertEquals(List.of(0, 1, 2), BFS.traverse(3, 0, edges));
    }

    @Test
    void traverseShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> BFS.traverse(-1, 0, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> BFS.traverse(3, 3, new int[0][0]));
        assertThrows(IllegalArgumentException.class, () -> BFS.traverse(3, 0, null));
        assertThrows(IllegalArgumentException.class, () -> BFS.traverse(3, 0, new int[][]{{0, 3}}));
        assertThrows(IllegalArgumentException.class, () -> BFS.traverse(3, 0, new int[][]{{0}}));
    }
}
