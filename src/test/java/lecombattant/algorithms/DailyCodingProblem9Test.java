package lecombattant.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem9Test {

  private DailyCodingProblem9 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem9();
  }


  @Test
  @DisplayName("When list equals to [2, 4, 6, 2, 5] , then return 13")
  void maxSumOfNonAdjacentNumberReturn13() {
    int[] tabOfNumber = {2, 4, 6, 2, 5};
    Assertions.assertAll(() -> Assertions.assertEquals(13, cut.maxSumOfNonAdjacentNumber(tabOfNumber)));
  }

  @Test
  @DisplayName("When list equals to [5, 1, 1, 5] , then return 10")
  void maxSumOfNonAdjacentNumberReturn10() {
    int[] tabOfNumber = {5, 1, 1, 5};
    Assertions.assertAll(() -> Assertions.assertEquals(10, cut.maxSumOfNonAdjacentNumber(tabOfNumber)));
  }
}
