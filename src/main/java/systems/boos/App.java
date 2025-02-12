package systems.boos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    demoSelectionSort();
    demoBinarySearch();
  }

  private static void demoSelectionSort() {
    System.out.println("Selection Sort");
    System.out.printf("==============%n%n");

    // generate a list of numbers from 1 to 10.
    var numbers = IntStream.rangeClosed(1, 10)
      .boxed()
      .collect(Collectors.toList());

    // Then shuffle the list randomly.
    Collections.shuffle(numbers);

    System.out.printf("Shuffled input: %s%n", numbers);

    var sorted = selectionSort(numbers);

    System.out.printf("   Sorted list: %s%n%n", sorted);
  }

  public static List<Integer> selectionSort(List<Integer> numbers) {
    var remaining = new LinkedList<>(numbers);
    var result = new ArrayList<Integer>(numbers.size());

    while (!remaining.isEmpty()) {
      var index = findSmallest(remaining);
      result.add(remaining.remove(index));
    }

    return result;
  }

  private static int findSmallest(List<Integer> numbers) {
    var smallest = numbers.get(0);
    var smallestIndex = 0;

    for (int index = 1; index < numbers.size(); index++) {
      var candidate = numbers.get(index);
      if (candidate < smallest) {
        smallest = candidate;
        smallestIndex = index;
      }
    }

    return smallestIndex;
  }

  private static void demoBinarySearch() {
    System.out.println("Binary Search");
    System.out.println("=============\n");

    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 9;
    var searchResult = binarySearch(numbers, target);

    if (searchResult.isPresent()) {
      var foundIndex = searchResult.get();
      System.out.printf(
        "Search %d -> %d is the index, %d is the value in %s%n",
        target,
        foundIndex,
        numbers.get(foundIndex),
        numbers
      );
    } else {
      System.out.printf("Search %d -> not found in %s%n", target, numbers);
    }
  }

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
