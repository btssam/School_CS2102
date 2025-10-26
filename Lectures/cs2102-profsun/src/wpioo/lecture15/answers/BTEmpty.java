package wpioo.lecture15.answers;

/**
 * One of exactly two cases for a Binary Tree: a Leaf Contains no data, used mainly to signal the end/backtracking of
 * traversal or base cases of algorithms
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BTEmpty<E> implements IBinTree<E> {

    /**
     * Pretty-prints leaf as a *
     *
     * @return a dangling leaf. leaf Emojis messed up the formatting :(
     */
    @Override
    public String toString() {
        return " | \n * ";
    }

    /**
     * Overriding equality for a Leaf
     *
     * @param o
     *            another Object, hopefully an IBinTree
     *
     * @return true if o is also a leaf
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof BTEmpty;
    }

    /**
     * An easy way to figure out if we are in the empty case instead of dynamic type checking
     *
     * @return true always
     */
    @Override
    public boolean isEmpty() {
        return true;
    }

    /**
     * get the root, except it is invalid on an empty leaf
     *
     * @return a runtime error
     */
    @Override
    public E getRoot() {
        throw new RuntimeException("Tried to request data on empty BT");
    }

    /**
     * get the left subtree, except it is invalid on an empty leaf
     *
     * @return a runtime error
     */
    @Override
    public IBinTree<E> getLeft() {
        throw new RuntimeException("Tried to request data on empty BT");
    }

    /**
     * get the right subtree, except it is invalid on an empty leaf
     *
     * @return a runtime error
     */
    @Override
    public IBinTree<E> getRight() {
        throw new RuntimeException("Tried to request data on empty BT");
    }

    /**
     * the height of this tree
     *
     * @return the length of the longest path from the current node to bottom most node in the tree 0 if the tree is a
     *         leaf.
     */
    @Override
    public int height() {
        return 0;
    }

    /**
     * the number of non-empty (non-leaf) nodes in this tree
     *
     * @return 0 since we are a leaf
     */
    @Override
    public int size() {
        return 0;
    }
}
