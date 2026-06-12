package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTest {
    @Test
    void newTreeShouldBeEmpty() {
        BinarySearchTree tree = new BinarySearchTree();

        assertTrue(tree.isEmpty());
        assertEquals(0, tree.size());
        assertEquals(List.of(), tree.inorder());
    }

    @Test
    void insertShouldAllowContainsAndSortedInorderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);

        assertTrue(tree.contains(4));
        assertFalse(tree.contains(6));
        assertEquals(5, tree.size());
        assertEquals(List.of(1, 3, 4, 5, 7), tree.inorder());
    }

    @Test
    void insertShouldIgnoreDuplicateValues() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(5);
        tree.insert(5);

        assertEquals(1, tree.size());
        assertEquals(List.of(5), tree.inorder());
    }

    @Test
    void deleteShouldRemoveLeafNode() {
        BinarySearchTree tree = populatedTree();

        assertTrue(tree.delete(1));

        assertFalse(tree.contains(1));
        assertEquals(List.of(3, 4, 5, 6, 7, 8), tree.inorder());
    }

    @Test
    void deleteShouldRemoveNodeWithTwoChildren() {
        BinarySearchTree tree = populatedTree();

        assertTrue(tree.delete(7));

        assertFalse(tree.contains(7));
        assertEquals(List.of(1, 3, 4, 5, 6, 8), tree.inorder());
        assertEquals(6, tree.size());
    }

    @Test
    void deleteShouldReturnFalseWhenValueDoesNotExist() {
        BinarySearchTree tree = populatedTree();

        assertFalse(tree.delete(99));
        assertEquals(7, tree.size());
    }

    private static BinarySearchTree populatedTree() {
        BinarySearchTree tree = new BinarySearchTree();
        for (int value : new int[]{5, 3, 7, 1, 4, 6, 8}) {
            tree.insert(value);
        }
        return tree;
    }
}
