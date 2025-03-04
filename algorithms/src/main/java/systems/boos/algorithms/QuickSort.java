package systems.boos.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class QuickSort implements CanSort {

  public List<Integer> sort(List<Integer> numbers) {
    if (numbers.size() <= 1) {
      return numbers;
    }

    var pivot = numbers.get(0);
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

  @Override
  public String getDescription() {
    return "QuickSort";
  }
}
