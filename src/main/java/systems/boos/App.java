package systems.boos;

public class App {

  @SuppressWarnings("java:S106") // Suppress: Standard outputs should not be used directly to log anything
  public static void main(String[] args) {
    Output output = new Output();

    executeDemos(output);

    System.out.println(output);
  }

  static void executeDemos(Output output) {
    Demos.binarySearch(output);
    Demos.selectionSort(output);
  }
}
