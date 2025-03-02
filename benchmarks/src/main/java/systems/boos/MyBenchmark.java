package systems.boos;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

public class MyBenchmark {

  @Benchmark
  @Fork(value = 1, warmups = 0)
  @BenchmarkMode(Mode.SingleShotTime)
  public void testMethod() {
    // This is a demo/sample template for building your JMH benchmarks.
    // Edit as needed.
    // Put your benchmark code here.
  }
}
