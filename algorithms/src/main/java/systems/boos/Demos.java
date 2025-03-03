package systems.boos;

import java.util.List;
import systems.boos.algorithms.*;

public class Demos {

  private Demos() {}

  static void search(Output output, CanSearch searcher) {
    var heading = searcher.getDescription();
    output.append("%s%n", heading);
    output.append("%s%n%n", "=".repeat(heading.length()));

    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 9;
    var searchResult = searcher.search(numbers, target);

    if (searchResult.isPresent()) {
      var foundIndex = searchResult.get();
      output.append(
        "Search %d -> %d is the index; %d is the value in %s%n",
        target,
        foundIndex,
        numbers.get(foundIndex),
        numbers
      );
    } else {
      output.append("Search %d -> not found in %s%n", target, numbers);
    }

    output.append("%n%n");
  }

  static void selectionSort(Output output) {
    output.append("Selection Sort%n");
    output.append("==============%n%n");

    // generate a list of numbers from 1 to 10.
    var numbers = List.of(2, 4, 5, 1, 10, 9, 7, 3, 8, 6);

    output.append("Shuffled input: %s%n", numbers);

    var sorted = SelectionSort.selectionSort(numbers);

    output.append("   Sorted list: %s%n%n%n", sorted);
  }

  public static void sum(Output output) {
    output.append("Sum of List%n");
    output.append("===========%n%n");

    var numbers = List.of(4, 6, 3, 7);
    output.append("Input: %s%n", numbers);

    var sum = Sum.sum(numbers);

    output.append("  Sum: %s%n%n%n", sum);
  }

  public static void count(Output output) {
    output.append("Count of Items in List%n");
    output.append("======================%n%n");

    var list = List.of(
      "Bred",
      "Butter",
      "Garlic",
      "Ice Cream",
      "Pizza",
      "Cookies",
      "Car",
      "Rubber Duck"
    );
    output.append("List: %s%n", list);

    var count = Count.count(list);
    output.append("Count: %s%n%n%n", count);
  }

  public static void max(Output output) {
    output.append("Maximum of List%n");
    output.append("===============%n%n");

    var list = List.of(
      82,
      973927,
      898,
      454,
      21,
      2,
      3,
      3,
      67,
      8,
      973927,
      886,
      98,
      0,
      0
    );
    output.append("   List: %s%n", list);

    var count = Max.max(list);
    output.append("Maximum: %s%n%n%n", count);
  }
}
