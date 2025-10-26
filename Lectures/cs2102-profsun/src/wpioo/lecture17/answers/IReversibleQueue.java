package wpioo.lecture17.answers;

/**
 * Interface for a generic reversible queue.
 *
 * @param <T>
 *            Generic type parameter for queue
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IReversibleQueue<T> extends IQueue<T> {

    /**
     * Reverses the contents of the queue.
     */
    public void reverse();
}
