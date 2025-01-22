package systems.boos;

import java.util.List;
import java.util.Optional;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 3;
    var foundIndex = binarySearch(numbers, target);
    System.out.printf(
      "%s is the index of %d in %s",
      foundIndex,
      target,
      numbers
    );
  }

  public static Optional<Integer> binarySearch(
    List<Integer> numbers,
    int target
  ) {
    if (numbers.isEmpty()) {
      return Optional.empty();
    }

    if (numbers.get(0) == target) {
      return Optional.of(0);
    }

    return Optional.empty();
  }
}
