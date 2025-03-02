package systems.boos;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.openjdk.jmh.annotations.*;
import systems.boos.algorithms.BinarySearchRecursion;
import systems.boos.algorithms.CanSearch;

@State(Scope.Benchmark)
public class ExecutionPlan {

  @Param(
    {
      "10000",
      "31600",
      "100000",
      "316000",
      "1000000",
      "3160000",
      "10000000",
      "31600000",
      "100000000",
      "200000000",
    }
  )
  public int size;

  private final Random random = new Random();

  public CanSearch searcher;

  public List<Integer> numbers;

  public int target;

  @Setup(Level.Invocation)
  public void setUp() {
    int firstInNumbers = 100001;

    numbers = IntStream.range(firstInNumbers, firstInNumbers + size)
      .boxed()
      .collect(Collectors.toList());

    target = random.nextInt(size) + firstInNumbers;

    searcher = new BinarySearchRecursion();
  }
}
