package lecombattant.algorithms;

import lecombattant.algorithms.DailyCodingProblemThree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblemThreeTest {

  private DailyCodingProblemThree cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblemThree();
  }


  @Test
  @DisplayName("When serialise and deserialize Node, then result is the same")
  void serialiseAndDeserialize() {
  }

  @Test
  @DisplayName("When serialise Node, then result is the string separed with one space")
  void serialize() {
    Node leftLeft = Node.builder().root("left.left").build();
    Node left = Node.builder().root("left").left(leftLeft).build();
    Node root = Node.builder().root("root").left(left).build();

    String serialize = cut.serialize(root);
    System.out.println(serialize);

    Assertions.assertAll(() -> serialize.contains("root"));
  }

  @Test
  @DisplayName("Deserialize and serialize")
  void deserialize(){
    Node leftLeft = Node.builder().root("left.left").build();
    Node left = Node.builder().root("left").left(leftLeft).build();
    Node root = Node.builder().root("root").left(left).build();

    Assertions.assertAll(() -> cut.deserialize(cut.serialize(root)).getLeft().getLeft().getRoot().equals("left.left"));
  }
}
