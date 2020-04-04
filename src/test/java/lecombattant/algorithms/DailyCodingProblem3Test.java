package lecombattant.algorithms;

import lecombattant.algorithms.utils.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem3Test {

  private DailyCodingProblem3 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem3();
  }


  @Test
  @DisplayName("When serialise and deserialize Node, then result is the same")
  void serialiseAndDeserialize() {
  }

  @Test
  @DisplayName("When serialise Node, then result is the string separed with one space")
  void serialize() {
    Node leftLeft = Node.builder().value("left.left").build();
    Node left = Node.builder().value("left").left(leftLeft).build();
    Node root = Node.builder().value("root").left(left).build();

    String serialize = cut.serialize(root);
    System.out.println(serialize);

    Assertions.assertAll(() -> serialize.contains("root"));
  }

  @Test
  @DisplayName("Deserialize and serialize")
  void deserialize() {
    Node leftLeft = Node.builder().value("left.left").build();
    Node left = Node.builder().value("left").left(leftLeft).build();
    Node root = Node.builder().value("root").left(left).build();

    Assertions.assertAll(() -> Assert
        .assertTrue(cut.deserialize(cut.serialize(root)).getLeft().getLeft().getValue().equals("left.left")));
  }
}
