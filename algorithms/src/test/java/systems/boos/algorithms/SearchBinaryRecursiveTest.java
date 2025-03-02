package systems.boos.algorithms;

class SearchBinaryRecursiveTest
  implements CanSearchTest<SearchBinaryRecursive> {

  @Override
  public SearchBinaryRecursive createSearcher() {
    return new SearchBinaryRecursive();
  }
}
