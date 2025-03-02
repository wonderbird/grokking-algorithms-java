package systems.boos.algorithms;

class SearchSimpleForLoopTest implements CanSearchTest<SearchBinaryWhileLoop> {

  @Override
  public SearchBinaryWhileLoop createSearcher() {
    return new SearchBinaryWhileLoop();
  }
}
