package systems.boos.algorithms;

import java.util.Random;

public class QuickSortPivotRandom extends QuickSort implements CanSort {

  Random random = new Random();

  @Override
  protected int calculatePivotIndex(int sizeOfNumbers) {
    return random.nextInt(sizeOfNumbers);
  }

  @Override
  public String getDescription() {
    return "QuickSort with random element as pivot";
  }
}
