package systems.boos;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.openjdk.jmh.annotations.*;
import systems.boos.algorithms.SearchBinaryRecursive;
import systems.boos.algorithms.SearchBinaryWhileLoop;
import systems.boos.algorithms.SearchSimpleForLoop;

public class SearchBenchmark {

  /**
   * Benchmark the simple search algorithm implemented with a for loop.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 5, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public Optional<Integer> forLoop(ExecutionPlan plan) {
    return new SearchSimpleForLoop().search(plan.numbers, plan.target);
  }

  /**
   * Benchmark the binary search algorithm implemented with a recursion.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 5, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public Optional<Integer> recursion(ExecutionPlan plan) {
    return new SearchBinaryRecursive().search(plan.numbers, plan.target);
  }

  /**
   * Benchmark the binary search algorithm implemented with a while loop.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 5, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public Optional<Integer> whileLoop(ExecutionPlan plan) {
    return new SearchBinaryWhileLoop().search(plan.numbers, plan.target);
  }

  @State(Scope.Benchmark)
  public static class ExecutionPlan {

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

    public List<Integer> numbers;

    public int target;

    @Setup(Level.Invocation)
    public void setUp() {
      int firstInNumbers = 100001;

      numbers = IntStream.range(firstInNumbers, firstInNumbers + size)
        .boxed()
        .collect(Collectors.toList());

      target = random.nextInt(size) + firstInNumbers;
    }
  }
}
