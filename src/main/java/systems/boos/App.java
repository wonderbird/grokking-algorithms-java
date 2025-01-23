package systems.boos;

import java.util.List;
import java.util.Optional;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 9;
    var searchResult = binarySearch(numbers, target);

    if (searchResult.isPresent()) {
      var foundIndex = searchResult.get();
      System.out.printf(
        "Search %d -> %d is the index, %d is the value in %s",
        target,
        foundIndex,
        numbers.get(foundIndex),
        numbers
      );
    } else {
      System.out.printf("Search %d -> not found in %s", target, numbers);
    }
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
      } else if (numbers.get(indexOfCenter) < target) {
        indexOfLowestCandidate = indexOfCenter + 1;
      } else { // numbers.get(indexOfCenter) > target
        indexOfHighestCandidate = indexOfCenter - 1;
      }
    }

    return Optional.empty();
  }
}
