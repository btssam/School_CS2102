package wpioo.lecture15.answers;

/**
 * An Interface for an Immutable Binary Tree
 * <p>
 * Uses the Strategy Pattern for how to add elements
 * <p>
 * Uses the Visitor Pattern for how to traverse itself
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IBinTree<E> {

    /**
     * A replacement for dynamic type checking (avoid instanceof) to determine if we are in a base-case
     *
     * @return true if we are a representation of a leaf, false otherwise
     */
    public boolean isEmpty();

    /**
     * Assume valid for all non-leaves
     *
     * @return the int at the root of the tree
     */
    public E getRoot();

    /**
     * Assume valid for all non-leaves
     *
     * @return the left subtree which may be a leaf or a node
     */
    public IBinTree<E> getLeft();

    /**
     * Assume valid for all non-leaves
     *
     * @return the right subtree which may be a leaf or a node
     */
    public IBinTree<E> getRight();

    /**
     * the height of this tree
     *
     * @return the length of the longest path from the current node to bottom most node in the tree 0 if the tree is a
     *         leaf.
     */
    public int height();

    /**
     * the number of non-empty (non-leaf) nodes in this tree
     *
     * @return the count of all non-leaf nodes in this tree
     */
    public int size();
}
