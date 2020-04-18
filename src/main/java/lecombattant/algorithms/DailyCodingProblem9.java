package lecombattant.algorithms;

import lecombattant.algorithms.utils.Node;

/**
 * This problem was asked by Airbnb.
 *
 * Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
 *
 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 *
 * Follow-up: Can you do this in O(N) time and constant space?
 */

public class DailyCodingProblem9 {

  public int maxSumOfNonAdjacentNumber(int[] tabOfNumber) {
    /* Define the sum of integer with INCLUDE a integer at step i = 0 */
    int include = tabOfNumber[0];
    /* Define the sum of integer with EXCLUDE a integer at step i = 0 */
    int exclude = 0;

    for (int i=1;i<tabOfNumber.length;i++){
      //compute the new incl
      int old_incluse = include;
      include = Math.max(include, exclude + tabOfNumber[i]);
      exclude = old_incluse;
    }
    return include;
  }
}
