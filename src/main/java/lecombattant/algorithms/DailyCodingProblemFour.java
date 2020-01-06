package lecombattant.algorithms;

import io.vavr.collection.List;

/**
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3
 */

public class DailyCodingProblemFour {

  public Integer findLowestPositiveInteger(List<Integer> list) {
    List<Integer> l = list.filter(i -> i > 0).distinct().sorted().collect(List.collector());

    Integer min = l.get(0);
    for (int i = 1; i < l.length(); i++) {
      if (!l.contains(min + i)) {
        return min + i;
      }
    }
    return min+l.length();
  }
}
