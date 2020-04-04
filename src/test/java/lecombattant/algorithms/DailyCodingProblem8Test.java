package lecombattant.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lecombattant.algorithms.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem8Test {

  private DailyCodingProblem8 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem8();
  }


  @Test
  @DisplayName("When tree is Empty or null, then return 0")
  void countUniversalTreesInEmptyTree() {
    var root = Node.builder().build();
    Assertions.assertAll(() -> assertEquals(0, cut.countUniversalTrees(root)));
  }

  @Test
  @DisplayName("When tree contain only ONE element, then return 1")
  void countUniversalTreesInOnlyOneElement() {
    var root = Node.builder().value("1").build();
    Assertions.assertAll(() -> assertEquals(1, cut.countUniversalTrees(root)));
  }

  @Test
  @DisplayName("When tree contain 5 sub tree, then return 5")
  void countUniversalTreesWith5Subtrees() {
    var root = Node.builder().value("0").left(Node.builder().value("1").build())
        .right(Node.builder().value("0").left(
            Node.builder().value("1").left(Node.builder().value("1").build()).right(Node.builder().value("1").build())
                .build()).right(Node.builder().value("0").build()).build()).build();
    Assertions.assertAll(() -> assertEquals(5, cut.countUniversalTrees(root)));
  }
}
