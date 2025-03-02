package systems.boos;

import systems.boos.algorithms.SearchBinaryRecursive;
import systems.boos.algorithms.SearchBinaryWhileLoop;
import systems.boos.algorithms.SearchSimpleForLoop;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    Output output = new Output();

    executeDemos(output);

    System.out.println(output);
  }

  static void executeDemos(Output output) {
    Demos.binarySearch(output, new SearchBinaryWhileLoop());
    Demos.binarySearch(output, new SearchBinaryRecursive());
    Demos.binarySearch(output, new SearchSimpleForLoop());
    Demos.selectionSort(output);
    Demos.sum(output);
    Demos.count(output);
    Demos.max(output);
  }
}
