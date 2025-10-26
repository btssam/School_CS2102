package wpioo.lecture17.activity;

/**
 * Interface for a generic queue.
 *
 * @param <T>
 *            Generic type parameter for queue
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IQueue<T> {

    /**
     * Adds an element to the end of the queue.
     *
     * @param elem
     *            Element to be added
     */
    public void enqueue(T elem);

    /**
     * Removes the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    public T dequeue();

    /**
     * Retrieve (but does not remove) the front element from the queue.
     *
     * @return Element at the front of the queue
     */
    public T peek();
}
