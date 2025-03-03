package systems.boos.algorithms;

import java.util.List;
import java.util.Optional;

public class SearchBinaryRecursive implements CanSearch {

  @Override
  public Optional<Integer> search(List<Integer> numbers, int target) {
    return searchRecursive(numbers, target, 0, numbers.size() - 1);
  }

  // Adopted from https://www.geeksforgeeks.org/binary-search/#recursive-binary-search-algorithm
  private Optional<Integer> searchRecursive(
    List<Integer> numbers,
    int target,
    int left,
    int right
  ) {
    if (left > right) {
      return Optional.empty();
    }

    var center = (left + right) / 2;

    if (numbers.get(center) == target) {
      return Optional.of(center);
    }

    if (target < numbers.get(center)) {
      return searchRecursive(numbers, target, left, center - 1);
    } else {
      return searchRecursive(numbers, target, center + 1, right);
    }
  }

  @Override
  public String getDescription() {
    return "Binary Search Using Recursion";
  }
}
