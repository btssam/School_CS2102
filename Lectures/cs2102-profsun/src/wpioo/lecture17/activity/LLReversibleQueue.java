package wpioo.lecture17.activity;

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

    /**
     * A constructor for a {@link LinkedList}-based reversible queue implementation.
     */
    public LLReversibleQueue() {
        contents = new LinkedList<>();
        contentsRev = new LinkedList<>();
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param elem
     *            Element to be added
     */
    @Override
    public void enqueue(T elem) {
        // COMPLETE ME!
    }

    /**
     * Removes the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    @Override
    public T dequeue() {
        return null; // COMPLETE ME!
    }

    /**
     * Retrieve (but does not remove) the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    @Override
    public T peek() {
        return null; // COMPLETE ME!
    }

    /**
     * Reverses the contents of the queue.
     */
    @Override
    public void reverse() {
        // COMPLETE ME!
    }
}
