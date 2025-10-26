package wpioo.lecture17.activity;

/**
 * Interface for a generic stack.
 *
 * @param <T>
 *            Generic type parameter for stack
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IStack<T> {

    /**
     * Adds an element to the top of the stack.
     *
     * @param elem
     *            Element to be added
     */
    public void push(T elem);

    /**
     * Removes the top element from the stack.
     *
     * @return Element at the top of the stack
     */
    public T pop();

    /**
     * Retrieve (but does not remove) the top element from the stack.
     *
     * @return Element at the top of the stack
     */
    public T peek();
}
