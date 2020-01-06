package lecombattant.algorithms;

import io.vavr.control.Option;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import lombok.Builder;
import lombok.Data;

/**
 * This problem was asked by Google.
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree
 *
 * For example, given the following Node class
 * class Node:
 * def __init__(self, val, left=None, right=None):
 * self.val = val
 * self.left = left
 * self.right = right
 *
 * The following test should pass:
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */

public class DailyCodingProblemThree {

  public static String serialize(Node tree) {
    if (tree == null) {
      return "";
    } else {
      return tree.getRoot() + Node.SEPARATOR + serialize(tree.getLeft()) + Node.SEPARATOR + serialize(tree.getRight());
    }
  }

  public static Node deserialize(final String tree) {
    String[] splitTree = Option.of(tree).map(r -> r.split(Node.SEPARATOR)).get();
    Queue<String> queueNodes = new LinkedList<>();
    queueNodes.addAll(Arrays.asList(splitTree));

    return deserializeHelper(queueNodes);
  }

  public static Node deserializeHelper(final Queue<String> nodes) {
    Option<String> root = Option.of(nodes.poll());
    if (root.isEmpty()) {
      return Node.builder().build();
    }
    Node tree = Node.builder().root(root.get()).build();
    tree.setLeft(deserializeHelper(nodes));
    tree.setRight(deserializeHelper(nodes));

    return tree;
  }

  @Data
  @Builder
  public static class Node {

    public static final String SEPARATOR = " -1 ";
    private String root;
    private Node left;
    private Node right;
  }
}
