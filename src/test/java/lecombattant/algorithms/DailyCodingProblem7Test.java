package lecombattant.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class DailyCodingProblem7Test {

  private DailyCodingProblem7 cut;

  @BeforeEach
  void setUp() {
    cut = new DailyCodingProblem7();
  }


  @Test
  @DisplayName("When encode string is 111, then result is 3")
  void countDecodeString() {
    Assertions.assertAll(() -> assertEquals(3, cut.countDecodeString(new char[]{'1', '1', '1'})));
  }

  @Test
  @DisplayName("When encode string is 1234, then result is 3")
  void countDecodeString4Digits() {
    Assertions.assertAll(() -> assertEquals(3, cut.countDecodeString(new char[]{'1', '2', '3', '4'})));
  }

  @Test
  @DisplayName("When encode string is 101, then result is 2")
  void countDecodeStringWith0Digits() {
    Assertions.assertAll(() -> assertEquals(2, cut.countDecodeString(new char[]{'1', '0', '1'})));
  }

  @Test
  @DisplayName("When encode string is 111, then result is 3")
  void  countDecodeStringDyn() {
    Assertions.assertAll(() -> assertEquals(3, cut.countDecodeStringDynamic(new char[]{'1', '1', '1'})));
  }

  @Test
  @DisplayName("When encode string is 1234, then result is 3")
  void countDecodeStringDyn4Digits() {
    Assertions.assertAll(() -> assertEquals(3, cut.countDecodeStringDynamic(new char[]{'1', '2', '3', '4'})));
  }

  @Test
  @DisplayName("When encode string is 101, then result is 2")
  void countDecodeStringDynWith0Digits() {
    Assertions.assertAll(() -> assertEquals(2, cut.countDecodeStringDynamic(new char[]{'1', '0', '1'})));
  }
}
