package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTraversalTest {
    @Test
    void preorderShouldVisitRootLeftRight() {
        assertEquals(List.of(1, 2, 4, 5, 3, 6), BinaryTreeTraversal.preorder(sampleTree()));
    }

    @Test
    void inorderShouldVisitLeftRootRight() {
        assertEquals(List.of(4, 2, 5, 1, 3, 6), BinaryTreeTraversal.inorder(sampleTree()));
    }

    @Test
    void postorderShouldVisitLeftRightRoot() {
        assertEquals(List.of(4, 5, 2, 6, 3, 1), BinaryTreeTraversal.postorder(sampleTree()));
    }

    @Test
    void levelOrderShouldGroupNodesByDepth() {
        assertEquals(
                List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6)),
                BinaryTreeTraversal.levelOrder(sampleTree())
        );
    }

    @Test
    void traversalsShouldHandleEmptyTree() {
        assertEquals(List.of(), BinaryTreeTraversal.preorder(null));
        assertEquals(List.of(), BinaryTreeTraversal.inorder(null));
        assertEquals(List.of(), BinaryTreeTraversal.postorder(null));
        assertEquals(List.of(), BinaryTreeTraversal.levelOrder(null));
    }

    @Test
    void traversalsShouldHandleSingleNodeTree() {
        TreeNode root = new TreeNode(9);

        assertEquals(List.of(9), BinaryTreeTraversal.preorder(root));
        assertEquals(List.of(9), BinaryTreeTraversal.inorder(root));
        assertEquals(List.of(9), BinaryTreeTraversal.postorder(root));
        assertEquals(List.of(List.of(9)), BinaryTreeTraversal.levelOrder(root));
    }

    private static TreeNode sampleTree() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, null, six);
        return new TreeNode(1, two, three);
    }
}
