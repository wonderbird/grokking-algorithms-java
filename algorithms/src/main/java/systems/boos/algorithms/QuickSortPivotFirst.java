package systems.boos.algorithms;

public class QuickSortPivotFirst extends QuickSort implements CanSort {

  @Override
  protected int calculatePivotIndex(int sizeOfNumbers) {
    return 0;
  }

  @Override
  public String getDescription() {
    return "QuickSort with first element as pivot";
  }
}
