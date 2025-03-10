package systems.boos.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class QuickSort {

  public List<Integer> sort(List<Integer> numbers) {
    if (numbers.size() <= 1) {
      return numbers;
    }

    var pivot = numbers.get(calculatePivotIndex(numbers.size()));
    var less = new ArrayList<Integer>();
    var greater = new ArrayList<Integer>();

    for (Integer number : numbers) {
      if (number < pivot) {
        less.add(number);
      } else if (number > pivot) {
        greater.add(number);
      }
    }

    return Stream.concat(
      Stream.concat(sort(less).stream(), Stream.of(pivot)),
      sort(greater).stream()
    ).toList();
  }

  protected abstract int calculatePivotIndex(int sizeOfNumbers);
}
