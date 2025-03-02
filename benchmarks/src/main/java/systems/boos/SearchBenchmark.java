package systems.boos;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
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
  @Fork(value = 10, warmups = 1)
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
  @Fork(value = 10, warmups = 1)
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
  @Fork(value = 10, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public Optional<Integer> whileLoop(ExecutionPlan plan) {
    return new SearchBinaryWhileLoop().search(plan.numbers, plan.target);
  }
}
