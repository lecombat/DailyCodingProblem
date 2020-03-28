package lecombattant.algorithms;

import static org.junit.jupiter.api.Assertions.assertAll;

import io.vavr.collection.List;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblemFourTest {

  private DailyCodingProblemFour cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblemFour();
  }


  @Test
  @DisplayName("When list is [3, 4, -1, 1], then return 3")
  void findLowestPositiveInteger() {
    List<Integer> list = List.of(3, 4, -1, 1);

    assertAll(() -> Assert.assertEquals(2, (int) cut.findLowestPositiveInteger(list)));
  }

  @Test
  @DisplayName("When list is [1, 2, 0], then return 3")
  void findLowestPositiveIntegerWithZero() {
    List<Integer> list = List.of(1, 2, 0);

    assertAll(() -> Assert.assertEquals(3, (int) cut.findLowestPositiveInteger(list)));
  }

  @Test
  @DisplayName("When list is [1, 2, 0], then not return 2")
  void findLowestPositiveIntegerNot() {
    List<Integer> list = List.of(1, 2, 0);

    assertAll(() -> Assert.assertNotEquals(2, (int) cut.findLowestPositiveInteger(list)));
  }
}
