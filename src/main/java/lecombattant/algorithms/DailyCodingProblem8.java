package lecombattant.algorithms;

import lecombattant.algorithms.utils.Node;

/**
 * This problem was asked by Google.
 *
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 *
 * Given the root to a binary tree, count the number of unival subtrees.
 *
 * For example, the following tree has 5 unival subtrees:
 *
 * 0
 * / \
 * 1   0
 * / \
 * 1   0
 * / \
 * 1   1
 */

public class DailyCodingProblem8 {

  public int countUniversalTrees(Node root) {
    int count = 0;

    if (root == null || root.getValue() == null) {
      return 0;
    }
    if (root.getLeft() == null && root.getRight() == null) {
      return 1;
    }
    var rootValue = root.getValue();
    var leftNode = root.getLeft();
    var rightNode = root.getRight();

    if (rootValue == leftNode.getValue() && rootValue == rightNode.getValue()) {
      count = count + 1;
    }

    //Count universal three in left and right
    count = count + countUniversalTrees(root.getLeft());
    count = count + countUniversalTrees(root.getRight());

    return count;
  }
}
