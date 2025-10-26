package wpioo.lecture17.answers;

/**
 * A class that demos the stack and queues.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Main {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // Stack (LIFO)
        IStack<Integer> s = new LLStack<>();
        s.push(1); // s.push(new Integer(1));
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("------");

        // Queue (FIFO)
        IQueue<Integer> q = new LLQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("------");

        // Reversible Queue
        IReversibleQueue<Integer> rq = new LLReversibleQueue<>();
        rq.enqueue(1);
        rq.enqueue(2);
        rq.enqueue(3);
        rq.enqueue(4);
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println("------");
        rq.reverse();
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
    }
}
