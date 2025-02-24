package systems.boos.algorithms;

import java.util.List;

public class Count {

  private Count() {}

  public static int count(List<?> list) {
    if (list.isEmpty()) {
      return 0;
    }
    return 1 + count(list.subList(1, list.size()));
  }
}
