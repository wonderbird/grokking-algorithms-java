package systems.boos;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demos {

  private Demos() {}

  static void binarySearch() {
    System.out.println("Binary Search");
    System.out.println("=============\n");

    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 9;
    var searchResult = BinarySearch.binarySearch(numbers, target);

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

  static void selectionSort() {
    System.out.println("Selection Sort");
    System.out.printf("==============%n%n");

    // generate a list of numbers from 1 to 10.
    var numbers = IntStream.rangeClosed(1, 10)
      .boxed()
      .collect(Collectors.toList());

    // Then shuffle the list randomly.
    Collections.shuffle(numbers);

    System.out.printf("Shuffled input: %s%n", numbers);

    var sorted = SelectionSort.selectionSort(numbers);

    System.out.printf("   Sorted list: %s%n%n", sorted);
  }
}
