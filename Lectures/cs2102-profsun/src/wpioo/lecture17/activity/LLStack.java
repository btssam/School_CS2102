package wpioo.lecture17.activity;

import java.util.LinkedList;

/**
 * This class implements a stack using a {@link LinkedList}.
 *
 * @param <T>
 *            Generic type parameter for stack
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class LLStack<T> implements IStack<T> {

    /** stack contents */
    private LinkedList<T> contents;

    /**
     * A constructor for a {@link LinkedList}-based stack implementation.
     */
    public LLStack() {
        contents = new LinkedList<>();
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param elem
     *            Element to be added
     */
    @Override
    public void push(T elem) {
        contents.addLast(elem);
    }

    /**
     * Removes the top element from the stack.
     *
     * @return Element at the top of the stack
     */
    @Override
    public T pop() {
        return contents.removeLast();
    }

    /**
     * Retrieve (but does not remove) the top element from the stack.
     *
     * @return Element at the top of the stack
     */
    @Override
    public T peek() {
        return contents.getLast();
    }
}
