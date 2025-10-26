package wpioo.lecture16.answers;

/**
 * A strategy for adding integers to a binary search tree
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class StrategyBST<E extends Comparable<E>> extends StrategyBTAbs<E> {

    /**
     * Adding an element to a tree is a subclass responsibility
     *
     * @param elt
     *            the element to add
     * @param b
     *            the tree to add it to
     *
     * @return a new tree with the element added
     */
    @Override
    public IBinTree<E> addElt(E elt, IBinTree<E> b) {
        if (b.isEmpty()) {
            return new BTNode<>(elt, new BTEmpty<>(), new BTEmpty<>());
        } else if (elt.compareTo(b.getRoot()) < 0) {
            return new BTNode<>(b.getRoot(), this.addElt(elt, b.getLeft()), b.getRight());
        } else {
            return new BTNode<>(b.getRoot(), b.getLeft(), this.addElt(elt, b.getRight()));
        }
    }
}
