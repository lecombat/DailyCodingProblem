package lecombattant.algorithms;

import io.vavr.collection.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem2Test {

  private DailyCodingProblem2 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem2();
  }

  @Test
  @DisplayName("When Zero don't contain in the array Then return new Array with corresponding product")
  void productOfArraysNotContainZero() {
    List list = List.of(1, 2, 3, 4, 5);
    List listExcepted = List.of(120, 60, 40, 30, 24);

    DailyCodingProblem2.productOfNumbersExceptPositionI(list);

    Assertions.assertAll(() -> DailyCodingProblem2.productOfNumbersExceptPositionI(list).equals(listExcepted));
  }

  @Test
  @DisplayName("When Zero contain in the array Then return new Array with corresponding product")
  void productOfArraysContainZero() {
    List list = List.of(1, 2, 3, 4, 0);
    List listExcepted = List.of(120, 60, 40, 30, 24);

    DailyCodingProblem2.productOfNumbersExceptPositionI(list);

    Assertions.assertAll(() -> DailyCodingProblem2.productOfNumbersExceptPositionI(list).equals(listExcepted));
  }
}
