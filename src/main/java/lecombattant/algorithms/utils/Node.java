package lecombattant.algorithms.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node {

  public static final String SEPARATOR = " -1 ";
  private String value;
  private Node left;
  private Node right;
}
