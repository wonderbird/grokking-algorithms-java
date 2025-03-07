package systems.boos.algorithms;

class CollectionsSortTest implements CanSortTest<CollectionsSort> {

  @Override
  public CollectionsSort createSorter() {
    return new CollectionsSort();
  }
}
