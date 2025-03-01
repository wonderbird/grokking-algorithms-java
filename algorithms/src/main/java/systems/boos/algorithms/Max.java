package systems.boos.algorithms;

import java.util.List;

public class Max {

  private Max() {}

  public static int max(List<Integer> numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }

    Integer first = numbers.get(0);
    if (numbers.size() == 1) {
      return first;
    }

    if (numbers.size() == 2) {
      Integer second = numbers.get(1);
      return first < second ? second : first;
    }

    return max(List.of(first, max(numbers.subList(1, numbers.size()))));
  }
}
