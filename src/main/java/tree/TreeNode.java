package tree;

/**
 * 二叉树节点。
 *
 * <p>这是树练习的基础数据结构，不包含算法答案。</p>
 */
public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
