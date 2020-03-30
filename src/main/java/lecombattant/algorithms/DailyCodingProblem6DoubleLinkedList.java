package lecombattant.algorithms;

import lombok.Builder;
import lombok.Data;

/**
 * This problem was asked by Google.
 *
 * An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.
 *
 * If using a language that has no pointers (such as Python), you can assume you have access to get_pointer and dereference_pointer functions that converts between nodes and memory addresses.
 */

@Data
public class DailyCodingProblem6DoubleLinkedList {

  private Node head;
  private Node tail;
  private int size;

  public DailyCodingProblem6DoubleLinkedList() {
  }

  public <T> void addFirst(T element) {
    Node node = Node.builder().value(element).next(head).build();
    if (head != null) {
      head.previous = node;
    }
    head = node;

    if (tail == null) {
      tail = node;
    }
    size++;
  }

  public <T> void addLast(T element) {
    Node node = Node.builder().value(element).previous(head).build();
    if (tail != null) {
      tail.next = node;
    }
    tail = node;

    if (head == null) {
      head = node;
    }
    size++;
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  @Data
  @Builder
  public static class Node<T> {

    private T value;
    private Node<T> previous;
    private Node<T> next;
  }
}
