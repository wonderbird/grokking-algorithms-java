package systems.boos;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;

public class BinarySearchBenchmark {

  /**
   * Benchmark the binary search algorithm implemented with a recursion.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 10, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public Optional<Integer> benchBinarySearchRecursion(ExecutionPlan plan) {
    return plan.searcher.binarySearch(plan.numbers, plan.target);
  }
}
