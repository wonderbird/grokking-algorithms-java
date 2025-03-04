package systems.boos;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.openjdk.jmh.annotations.*;
import systems.boos.algorithms.QuickSort;
import systems.boos.algorithms.SelectionSort;

public class SortBenchmark {

  /**
   * Benchmark the selection sort algorithm.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 5, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public List<Integer> selectionSort(ExecutionPlan plan) {
    return new SelectionSort().sort(plan.numbers);
  }

  /**
   * Benchmark the quicksort algorithm.
   * @param plan benchmark parameters
   * @return search result is returned in order to avoid dead code elimination
   */
  @Benchmark
  @Fork(value = 5, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public List<Integer> quicksort(ExecutionPlan plan) {
    return new QuickSort().sort(plan.numbers);
  }

  @State(Scope.Benchmark)
  public static class ExecutionPlan {

    @Param(
      {
        "333",
        "667",
        "1000",
        "1333",
        "1667",
        "2000",
        "2333",
        "2667",
        "3000",
        "3333",
        "3667",
        "4000",
      }
    )
    public int size;

    public List<Integer> numbers;

    @Setup(Level.Invocation)
    public void setUp() {
      numbers = IntStream.range(0, size).boxed().collect(Collectors.toList());
      Collections.shuffle(numbers);
    }
  }
}
