package lecombattant.algorithms;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem6Test {

  private DailyCodingProblem6 cut;
  //We can change the class with DailyCodingProblemSixDoubleLinkedList and observe the same behavior

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem6();
  }

  @Test
  @DisplayName("When add element in list, then return size equal 1")
  void addElement() {
    cut.addFirst(1);
    cut.addFirst(2);
    cut.addFirst(3);

    assertAll(() -> Assertions.assertEquals(3,cut.getSize()));
  }

  @Test
  @DisplayName("When get elements in list, then return the element in the given index in the right order")
  void getElement() {
    cut.addFirst(1);
    cut.addFirst(2);
    cut.addFirst(3);

    assertAll(() -> Assertions.assertEquals(3, cut.get(0).getValue()),
        () -> Assertions.assertEquals(2, cut.get(1).getValue()),
        () -> Assertions.assertEquals(1, cut.get(2).getValue()));
  }
}
