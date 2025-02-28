package systems.boos.algorithms;

class BinarySearchRecursionTest
  implements CanSearchTest<BinarySearchRecursion> {

  @Override
  public BinarySearchRecursion createSearcher() {
    return new BinarySearchRecursion();
  }
}
