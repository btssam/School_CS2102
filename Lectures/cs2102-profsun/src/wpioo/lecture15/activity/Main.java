package wpioo.lecture15.activity;

import java.util.List;

/**
 * A class that demos the strategy and visitor patterns for binary trees.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Main {

    /*
     * Lecture 15 - Learning Objectives: - Reuse a data structure with multiple algorithms using the strategy pattern -
     * Practice constructing and mutating Trees. - Validate operations that have multiple possible correct output -
     * Become familiar with the starter code for the Heap HW
     */

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        IBinTree<Integer> immutBT = new BTNode<>(1, new BTNode<>(2, new BTEmpty<>(), new BTEmpty<>()),
                new BTNode<>(3, new BTEmpty<>(), new BTEmpty<>()));
        // System.out.println(immutBT);

        BinaryTree<Integer> oneToSevBT = new BinaryTree<>(List.of(1, 2, 3, 4, 5, 6, 7));
        // System.out.println(oneToSevBT);

        BinaryTree<String> abcBT = new BinaryTree<>(List.of("a", "b", "c", "d", "e"));
        // System.out.println(abcBT);

        BinaryTree<Double> someBST = new BinaryTree<>(List.of(5.0, 3.0, 7.0, 1.0, 4.0, 6.0, 8.0));
        // System.out.println(someBST);
        someBST.setStrategy(new StrategyBST<>());
        someBST.addElt(2.0);
        // System.out.println(someBST);

        someBST.removeElt(5.0);
        // System.out.println(someBST);

        someBST.setStrategy(new StrategyAVL<>());
        someBST.addElt(9.0);
        // System.out.println(someBST);

        BinaryTree<String> anotherBST = new BinaryTree<>();
        anotherBST.setStrategy(new StrategyBST<>());
        anotherBST.addElt("a");
        anotherBST.addElt("b");
        anotherBST.addElt("c");
        anotherBST.addElt("d");
        anotherBST.addElt("e");
        // System.out.println(anotherBST);

        anotherBST.setStrategy(new StrategyAVL<>());
        anotherBST.addElt("f");

        // System.out.println(anotherBST);
    }
}
