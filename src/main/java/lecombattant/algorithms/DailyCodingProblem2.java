package lecombattant.algorithms;

import io.vavr.collection.List;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 */

public class DailyCodingProblem2 {

  public static List<Integer> productOfNumbersExceptPositionI(List<Integer> list) {
    Integer product = list.filter(integer -> integer != 0).reduce((int1, int2) -> int1 * int2);
    return list.filter(integer -> integer != 0).map(integer -> product / integer);
  }
}
