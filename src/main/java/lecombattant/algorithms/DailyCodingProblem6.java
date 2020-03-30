package lecombattant.algorithms;

import java.util.HashMap;
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
public class DailyCodingProblem6 {

  private Node head;
  private int size;

  // Derefence pointer and get it
  private HashMap<Integer, Node> map = new HashMap<>();

  public DailyCodingProblem6() {
  }

  private int getPointer(Node node) {
    return node == null ? 0 : node.hashCode();
  }

  private Node dereferencePointer(Integer pointer) {
    return pointer == 0 ? null : map.get(pointer);
  }

  public <T> void addFirst(T element) {
    //Calculate xor head and null
    Integer nextnxp = getPointer(head) ^ getPointer(null);

    Node newNode = Node.builder().value(element).nxp(nextnxp).build();

    if (head == null) {
      newNode.setNxp(0);
    } else {
      //compute next pointer of the node after head
      Integer nextPointer = head.nxp ^ getPointer((null));

      //So the XOR of next and previous on head is the xor of new Node and nextNode
      head.nxp = getPointer(newNode) ^ nextPointer;
    }
    head = newNode;
    map.put(getPointer(newNode), newNode);
    size++;
  }

  public Node get(int index) {
    Node prev = null;
    Node current = head;
    Node next = null;

    for (int i = 0; i < index; i++) {
      next = dereferencePointer(getPointer(prev) ^ current.getNxp());
      prev = current;
      current = next;
    }
    return current;
  }

  @Data
  @Builder
  public static class Node<T> {

    private T value;
    /*Next, previous XORed*/
    private Integer nxp;
  }
}
