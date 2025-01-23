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

    var indexOfLowestCandidate = 0;
    var indexOfHighestCandidate = numbers.size() - 1;

    while (indexOfLowestCandidate <= indexOfHighestCandidate) {
      var indexOfCenter =
        (indexOfLowestCandidate + indexOfHighestCandidate) / 2;

      if (numbers.get(indexOfCenter) == target) {
        return Optional.of(indexOfCenter);
      }

      indexOfLowestCandidate = indexOfCenter + 1;
    }

    return Optional.empty();
  }
}
