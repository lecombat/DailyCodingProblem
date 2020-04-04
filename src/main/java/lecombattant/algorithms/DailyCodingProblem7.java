package lecombattant.algorithms;

/**
 * This problem was asked by Facebook.
 *
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 *
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 *
 * You can assume that the messages are decodable. For example, '001' is not allowed
 */

public class DailyCodingProblem7 {

  /**
   * This algorith is exponential and it is execute in O(2^N)
   */
  public int countDecodeString(char[] codingString) {
    return countDecodeStringHelper(codingString, 0);
  }

  /**
   * This algorith is linear and it is execute in O(N)
   */
  public int countDecodeStringDynamic(char[] codingString) {
    //Table to store result of sub-problem
    int n = codingString.length;
    int[] count = new int[n + 1];
    //Initialization
    count[0] = 1;
    count[1] = 1;

    for (int i = 2; i <= n; i++) {
      //Add the last digit to the number on the work with one digit
      count[i] = count[i - 1];

      //Check if 2 digit char can be decode
      if (codingString[i-2] == '1'
          || codingString[i-2] == '2' && codingString[i-1] < '7') {
        count[i] = count[i] + count[i - 2];
      }
    }

    return count[n];
  }

  private int countDecodeStringHelper(char[] codingString, int startIndex) {
    int count = 0;

    //Base case, when we traverse one parcours
    if (startIndex == codingString.length) {
      return 1;
    }
    count = countDecodeStringHelper(codingString, startIndex + 1);

    //Check if 2 digit char can be decode
    if (startIndex + 1 < codingString.length && (codingString[startIndex] == '1'
        || codingString[startIndex] == '2' && codingString[startIndex + 1] < '7')) {
      count = count + countDecodeStringHelper(codingString, startIndex + 2);
    }
    return count;
  }
}
