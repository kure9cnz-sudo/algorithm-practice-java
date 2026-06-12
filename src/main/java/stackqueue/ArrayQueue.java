package stackqueue;

/**
 * 题目目标：用循环数组实现固定容量的整数队列。
 *
 * <p>输入：容量、offer 的整数值。</p>
 * <p>输出：poll/peek 返回队首元素；size/isEmpty/isFull 返回队列状态。</p>
 * <p>异常：容量小于等于 0 时抛出 IllegalArgumentException；满队列 offer 抛出 IllegalStateException；空队列 poll/peek 抛出 NoSuchElementException。</p>
 */
public class ArrayQueue {
    /**
     * 创建固定容量循环队列。
     *
     * @param capacity 队列容量
     */
    public ArrayQueue(int capacity) {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public void offer(int value) {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public int poll() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public int peek() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public int capacity() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }

    public boolean isFull() {
        throw new UnsupportedOperationException("TODO: implement by yourself");
    }
}
