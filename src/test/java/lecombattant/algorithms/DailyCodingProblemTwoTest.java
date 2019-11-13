package lecombattant.algorithms;

import io.vavr.collection.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblemTwoTest {

  private DailyCodingProblemTwo cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblemTwo();
  }

  @Test
  @DisplayName("When Zero don't contain in the array Then return new Array with corresponding product")
  void productOfArraysNotContainZero() {
    List list = List.of(1, 2, 3, 4, 5);
    List listExcepted = List.of(120, 60, 40, 30, 24);

    DailyCodingProblemTwo.productOfNumbersExceptPositionI(list);

    Assertions.assertAll(() -> DailyCodingProblemTwo.productOfNumbersExceptPositionI(list).equals(listExcepted));
  }

  @Test
  @DisplayName("When Zero contain in the array Then return new Array with corresponding product")
  void productOfArraysContainZero() {
    List list = List.of(1, 2, 3, 4, 0);
    List listExcepted = List.of(120, 60, 40, 30, 24);

    DailyCodingProblemTwo.productOfNumbersExceptPositionI(list);

    Assertions.assertAll(() -> DailyCodingProblemTwo.productOfNumbersExceptPositionI(list).equals(listExcepted));
  }
}
