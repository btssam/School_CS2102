package wpioo.lecture17.answers;

import java.util.LinkedList;

/**
 * This class implements a reversible queue using two {@link LinkedList}s.
 *
 * @param <T>
 *            Generic type parameter for queue
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class LLReversibleQueue<T> implements IReversibleQueue<T> {

    /** queue contents (one way) */
    private LinkedList<T> contents;

    /** queue contents (other way) */
    private LinkedList<T> contentsRev;

    /** Return reverse */
    private boolean returnRev;

    /**
     * A constructor for a {@link LinkedList}-based reversible queue implementation.
     */
    public LLReversibleQueue() {
        contents = new LinkedList<>();
        contentsRev = new LinkedList<>();
        returnRev = false;
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param elem
     *            Element to be added
     */
    @Override
    public void enqueue(T elem) {
        // Version 1: Like Queue
        // contents.addLast(elem); O(1)

        // Version 3: Add to both linked list O(1)
        contents.addLast(elem);
        contentsRev.addFirst(elem);
    }

    /**
     * Removes the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    @Override
    public T dequeue() {
        // Version 1: Like Queue
        // return contents.removeFirst(); O(1)

        // Version 3: Remove from both linked O(1)
        if (returnRev) {
            contents.removeLast();
            return contentsRev.removeFirst();
        } else {
            contentsRev.removeLast();
            return contents.removeFirst();
        }
    }

    /**
     * Retrieve (but does not remove) the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    @Override
    public T peek() {
        // Version 1: Like Queue
        // return contents.getFirst(); O(1)

        // Version 3: Remove from both linked list O(1)
        if (returnRev) {
            return contentsRev.getLast();
        } else {
            return contents.getFirst();
        }
    }

    /**
     * Reverses the contents of the queue.
     */
    @Override
    public void reverse() {
        // // Version 1a: Build a New LinkedList that is the reverse
        // for (int i = contents.size() - 1; i >= 0; i--) { O(N)
        // contentsRev.add(contents.get(i)); O(N)
        // }
        // contents = contentsRev; O(N^2)

        // Version 1a: Build a New LinkedList that is the reverse
        // for (T elem : contents) {
        // contentsRev.addFirst(elem);
        // }

        // Version 2: Use stack to reverse it
        // Stack<T> stack = new Stack<>();
        // for (T elem : contents) {
        // stack.push(elem);
        // }
        // for (int i = 0; i < contents.size(); i++) {
        // contentsRev.add(stack.pop());
        // }
        // contents = contentsRev;

        // Version 3: Switch to other linked list O(1)
        returnRev = !returnRev;
    }
}
