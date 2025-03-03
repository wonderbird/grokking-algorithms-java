package systems.boos.algorithms;

class NotQuickSortTest implements CanSortTest<NotQuickSort> {

  @Override
  public NotQuickSort createSorter() {
    return new NotQuickSort();
  }
}
