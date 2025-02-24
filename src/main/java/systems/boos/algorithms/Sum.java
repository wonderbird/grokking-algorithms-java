package systems.boos.algorithms;

import java.util.List;

public class Sum {

  private Sum() {}

  public static int sum(List<Integer> numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }

    return numbers.get(0) + sum(numbers.subList(1, numbers.size()));
  }
}
