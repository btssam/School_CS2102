package wpioo.lecture16.answers;

import java.util.Random;

/**
 * An example max heap strategy for adding an int to an existing max heap
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class StrategyMaxHeap3<E extends Comparable<E>> extends StrategyBTAbs<E> implements IBTStrategy<E> {

    /**
     * Produces a new tree by adding i to the elements of the old tree (respecting any invariants)
     *
     * @param elt
     *            the element to add to the tree
     * @param b
     *            a tree assumed to respect any invariants needed by the strategy
     *
     * @return the new (immutable) tree now containing elt
     */
    @Override
    public BTNode<E> addElt(E elt, IBinTree<E> b) {
        if (b.isEmpty()) {
            return new BTNode<>(elt, new BTEmpty<>(), new BTEmpty<>());
        } else {
            Random r = new Random();
            if (elt.compareTo(b.getRoot()) < 0) {
                if (r.nextBoolean()) {
                    return new BTNode<>(b.getRoot(), b.getLeft(), this.addElt(elt, b.getRight()));
                } else {
                    return new BTNode<>(b.getRoot(), this.addElt(elt, b.getLeft()), b.getRight());
                }
            } else {
                if (r.nextBoolean()) {
                    return new BTNode<>(elt, b.getLeft(), this.addElt(b.getRoot(), b.getRight()));
                } else {
                    return new BTNode<>(elt, this.addElt(b.getRoot(), b.getLeft()), b.getRight());
                }
            }
        }
    }
}
