package systems.boos.algorithms;

class SelectionSortTest implements CanSortTest<SelectionSort> {

  @Override
  public SelectionSort createSorter() {
    return new SelectionSort();
  }
}
