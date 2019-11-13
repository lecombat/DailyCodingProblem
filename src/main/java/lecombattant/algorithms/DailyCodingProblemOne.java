package lecombattant.algorithms;

import io.vavr.collection.List;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 *
 * This Algorith it is on O(n) complexity
 */

public final class DailyCodingProblemOne {

  public static Boolean containsTwoNumbersWithSumEqualsTo(List<Integer> list, Integer k){
    HashSet<Integer> distinctValues = new HashSet<Integer>();
    AtomicReference<Boolean> result = new AtomicReference<>(false);

    list.forEach(integer -> {
      if(distinctValues.contains(k-integer)){
        result.set(true);
      }
      distinctValues.add(integer);
    }
    );

    return result.get();
  }
}
