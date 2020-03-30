package lecombattant.algorithms;

import io.vavr.collection.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem1Test {

  private DailyCodingProblem1 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem1();
  }

  @Test
  @DisplayName("When Exist two number with sum equal K, then return TRUE")
  void containsTwoNumbersWithSumEqualsTo() {
    var list = io.vavr.collection.List.of(10, 15, 3, 7);
    var k = 17;

    Boolean result = cut.containsTwoNumbersWithSumEqualsTo(list, k);

    Assertions.assertAll(() -> Assert.assertTrue(result)
    );
  }

  @Test
  @DisplayName("When Exist two number with sum equal K, then return TRUE")
  void containsTwoNumbersWithSumEqualsTo_() {
    var list = List.of(10, 15, 3, 0, 9, 8);
    var k = 17;

    Boolean result = cut.containsTwoNumbersWithSumEqualsTo(list, k);

    Assertions.assertAll(() -> Assert.assertTrue(result)
    );
  }

  @Test
  @DisplayName("When Not Exist two number with sum equal K, then return FALSE")
  void notContainsTwoNumbersWithSumEqualsTo() {
    var list = List.of(10, 15, 3, 0, 9, 8);
    var k = 17;

    Boolean result = cut.containsTwoNumbersWithSumEqualsTo(list, k);

    Assertions.assertAll(() -> Assert.assertFalse(result)
    );
  }
}
