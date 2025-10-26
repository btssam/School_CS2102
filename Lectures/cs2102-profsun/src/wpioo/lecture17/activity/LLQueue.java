package wpioo.lecture17.activity;

import java.util.LinkedList;

/**
 * This class implements a queue using a {@link LinkedList}.
 *
 * @param <T>
 *            Generic type parameter for queue
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class LLQueue<T> implements IQueue<T> {

    /** queue contents */
    private LinkedList<T> contents;

    /**
     * A constructor for a {@link LinkedList}-based queue implementation.
     */
    public LLQueue() {
        contents = new LinkedList<>();
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
}
