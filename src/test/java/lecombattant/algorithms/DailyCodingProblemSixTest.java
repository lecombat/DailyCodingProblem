package lecombattant.algorithms;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblemSixTest {

  private DailyCodingProblemSix cut;
  //We can change the class with DailyCodingProblemSixDoubleLinkedList and observe the same behavior

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblemSix();
  }

  @Test
  @DisplayName("When add element in list, then return size equal 1")
  void addElement() {
    cut.addFirst(1);
    cut.addFirst(2);
    cut.addFirst(3);

    assertAll(() -> Assertions.assertTrue(cut.getSize() == 3));
  }

  @Test
  @DisplayName("When get elements in list, then return the element in the given index in the right order")
  void getElement() {
    cut.addFirst(1);
    cut.addFirst(2);
    cut.addFirst(3);

    assertAll(() -> Assertions.assertTrue(cut.get(0).getValue().equals(3)),
        () -> Assertions.assertTrue(cut.get(1).getValue().equals(2)),
        () -> Assertions.assertTrue(cut.get(2).getValue().equals(1)));
  }
}
