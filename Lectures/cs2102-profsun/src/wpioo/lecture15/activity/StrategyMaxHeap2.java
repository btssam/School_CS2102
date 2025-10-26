package wpioo.lecture15.activity;

/**
 * An example max heap strategy for adding an int to an existing max heap
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class StrategyMaxHeap2<E extends Comparable<E>> extends StrategyBTAbs<E> implements IBTStrategy<E> {

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
            if (elt.compareTo(b.getRoot()) < 0) {
                return new BTNode<>(b.getRoot(), b.getRight(), this.addElt(elt, b.getLeft()));
            } else {
                return new BTNode<>(elt, this.addElt(b.getRoot(), b.getRight()), b.getLeft());
            }
        }
    }
}
