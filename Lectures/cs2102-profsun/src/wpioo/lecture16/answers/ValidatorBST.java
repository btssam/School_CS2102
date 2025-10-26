package wpioo.lecture16.answers;

/**
 * A validator object for binary search trees and their invariants
 *
 * @version 3.0
 */
public class ValidatorBST<E extends Comparable<E>> implements IBTValidator<E> {

    /**
     * Check if adding elt to the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree
     *            the given tree we assume respects the invariants
     * @param elt
     *            the element to add
     * @param newTree
     *            the new tree which we are validating
     *
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validAdd(IBinTree<E> oldTree, E elt, IBinTree<E> newTree) {
        // Assuming oldTree is BST
        // Show:
        // 1. BST Invariant
        boolean newTreeIsValidBST = this.validBST(newTree);

        // 2. oldTree.size + 1 = newTree.size
        boolean sizeIsOneMore = newTree.size() == oldTree.size() + 1;

        // 3. newTree must have everything in oldTree
        boolean containsEverything = this.containsAll(oldTree, newTree);

        // 4. newTree must have elt
        boolean newTreeContainsElt = this.contains(elt, newTree);

        // 5. oldTree shouldn't have elt
        boolean oldTreeDoesNotContainElt = !this.contains(elt, oldTree);

        return newTreeIsValidBST && sizeIsOneMore && containsEverything && newTreeContainsElt
                && oldTreeDoesNotContainElt;
    }

    /**
     * The BST invariant of all left < node < all right
     *
     * @param someTree
     *            the tree we are checking
     *
     * @return true if the root node is sorted between all values of its left and right subtrees and all subtrees are
     *         valid BSTs
     */
    private boolean validBST(IBinTree<E> someTree) {
        if (someTree.isEmpty()) {
            return true;
        } else {
            boolean rootIsBiggerThanLeftTree = this.biggerThanAll(someTree.getRoot(), someTree.getLeft());
            boolean rootIsSmallerThanRightTree = this.smallerThanAll(someTree.getRoot(), someTree.getRight());
            boolean leftIsValidBST = this.validBST(someTree.getLeft());
            boolean rightIsValidBST = this.validBST(someTree.getRight());

            return rootIsBiggerThanLeftTree && rootIsSmallerThanRightTree && leftIsValidBST && rightIsValidBST;
        }
    }

    /**
     * A helper method to check if an integer is bigger than every element in a tree
     *
     * @param elt
     *            the element that should be bigger
     * @param subTree
     *            the tree to check against
     *
     * @return true if key is bigger than all keys in b
     */
    private boolean biggerThanAll(E elt, IBinTree<E> subTree) {
        if (subTree.isEmpty()) {
            return true;
        } else {
            // 1. elt is bigger than someTree's root
            // 2. elt is bigger than everything in someTree's left subtree
            // 3. elt is bigger than everything in someTree's right subtree
            return elt.compareTo(subTree.getRoot()) > 0 && this.biggerThanAll(elt, subTree.getLeft())
                    && this.biggerThanAll(elt, subTree.getRight());
        }
    }

    /**
     * A helper method to check if an integer is smaller than every element in a tree
     *
     * @param elt
     *            the element that should be smaller
     * @param subTree
     *            the tree to check against
     *
     * @return true if key is smaller than all keys in b
     */
    private boolean smallerThanAll(E elt, IBinTree<E> subTree) {
        if (subTree.isEmpty()) {
            return true;
        } else {
            // 1. elt is smaller than someTree's root
            // 2. elt is smaller than everything in someTree's left subtree
            // 3. elt is smaller than everything in someTree's right subtree
            return elt.compareTo(subTree.getRoot()) < 0 && this.smallerThanAll(elt, subTree.getLeft())
                    && this.smallerThanAll(elt, subTree.getRight());
        }
    }

    /**
     * A helper method for if a tree contains all the elements of another
     *
     * @param smallerTree
     *            the tree holding the elements
     * @param biggerTree
     *            the tree we are checking
     *
     * @return true if the container tree has the elements from the elements tree in any order
     */
    private boolean containsAll(IBinTree<E> smallerTree, IBinTree<E> biggerTree) {
        if (smallerTree.isEmpty()) {
            return true;
        } else {
            // 1. smallerTree's root must be in biggerTree
            // 2. Everything to the left of the smallerTree must be in biggerTree
            // 3. Everything to the right of the smallerTree must be in biggerTree
            return this.contains(smallerTree.getRoot(), biggerTree)
                    && this.containsAll(smallerTree.getLeft(), biggerTree)
                    && this.containsAll(smallerTree.getRight(), biggerTree);
        }
    }

    /**
     * A helper method for if a tree contains an element
     *
     * @param elt
     *            the element to look for
     * @param someTree
     *            the tree to recurse over
     *
     * @return true if the element appears in the tree
     */
    private boolean contains(E elt, IBinTree<E> someTree) {
        if (someTree.isEmpty()) {
            return false;
        }

        // 1. It is the root
        // 2. It is to the left
        // 3. It is to the right
        return elt.compareTo(someTree.getRoot()) == 0 || this.contains(elt, someTree.getLeft())
                || this.contains(elt, someTree.getRight());
    }

    /**
     * Check if removing elt from the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree
     *            the given tree we assume respects the invariants
     * @param elt
     *            the element to remove
     * @param newTree
     *            the new tree which we are validating
     *
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validRemove(IBinTree<E> oldTree, E elt, IBinTree<E> newTree) {
        // Assuming oldTree is BST
        // Show:
        // 1. BST Invariant
        boolean newTreeIsValidBST = this.validBST(newTree);

        // 2. oldTree.size + 1 = newTree.size
        boolean sizeIsOneMore = newTree.size() == oldTree.size() - 1;

        // 3. newTree must have everything in oldTree
        boolean containsEverything = this.containsAll(newTree, oldTree);

        // 4. newTree must not have elt
        boolean newTreeContainsElt = !this.contains(elt, newTree);

        // 5. oldTree should have elt
        boolean oldTreeDoesNotContainElt = this.contains(elt, oldTree);

        return newTreeIsValidBST && sizeIsOneMore && containsEverything && newTreeContainsElt
                && oldTreeDoesNotContainElt;
    }
}
