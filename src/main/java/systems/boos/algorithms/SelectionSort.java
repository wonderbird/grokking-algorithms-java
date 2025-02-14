package systems.boos.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

  private SelectionSort() {}

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
}
