package systems.boos.algorithms;

import java.util.List;
import java.util.Optional;

public class BinarySearchRecursion implements CanSearch {

  @Override
  public Optional<Integer> binarySearch(List<Integer> numbers, int target) {
    if (numbers.isEmpty()) {
      return Optional.empty();
    }

    if (numbers.size() == 1) {
      if (numbers.get(0) == target) {
        return Optional.of(0);
      } else {
        return Optional.empty();
      }
    }

    var right = numbers.size();
    var center = right / 2;

    if (target < numbers.get(center)) {
      return binarySearch(numbers.subList(0, center), target);
    } else {
      var result = binarySearch(numbers.subList(center, right), target);
      return result.map(index -> center + index);
    }
  }

  @Override
  public String getDescription() {
    return "Recursion";
  }
}
