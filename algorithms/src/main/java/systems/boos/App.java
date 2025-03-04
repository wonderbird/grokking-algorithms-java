package systems.boos;

import systems.boos.algorithms.*;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    Output output = new Output();

    executeDemos(output);

    System.out.println(output);
  }

  static void executeDemos(Output output) {
    Demos.search(output, new SearchBinaryWhileLoop());
    Demos.search(output, new SearchBinaryRecursive());
    Demos.search(output, new SearchSimpleForLoop());
    Demos.sort(output, new SelectionSort());
    Demos.sort(output, new QuickSort());
    Demos.sum(output);
    Demos.count(output);
    Demos.max(output);
  }
}
