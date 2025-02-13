package systems.boos;

import java.util.List;
import java.util.Optional;

class BinarySearch {

  private BinarySearch() {}

  public static Optional<Integer> binarySearch(
    List<Integer> numbers,
    int target
  ) {
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
