package systems.boos.algorithms;

import java.util.List;

public class NotQuickSort implements CanSort {

  public List<Integer> sort(List<Integer> numbers) {
    return new SelectionSort().sort(numbers);
  }
}
