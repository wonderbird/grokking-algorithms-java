package systems.boos.algorithms;

class BinarySearchWhileLoopTest
  implements CanSearchTest<BinarySearchWhileLoop> {

  @Override
  public BinarySearchWhileLoop createSearcher() {
    return new BinarySearchWhileLoop();
  }
}
