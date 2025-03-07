# Grokking Algorithms Java

My implementation of the algorithms presented in Aditya Bhargava: Grokking Algorithms, 2nd Ed.

## Build and Test

To clean up and setup target directories enter

```shell
mvn clean
```

To format the code using [Prettier](https://github.com/jhipster/prettier-java) and to run the tests, enter

```shell
mvn test
```

## Benchmark Search Algorithms

The module [benchmarks](./benchmarks) uses the [Java Microbenchmark Harness JMH](https://github.com/openjdk/jmh) to compare the performance of different search algorithm implementations.

Before starting the benchmarks, compile the algorithms package:

```shell
mvn clean verify
```

If you omit this step, the benchmark might measure an outdated package of [algorithms](./algorithms).

To run the benchmarks as configured by the code annotations, enter

```shell
java -jar ./benchmarks/target/benchmarks.jar -rff benchmarks.json -rf json
```

Then you can visualize the results by uploading the ./benchmarks.json file to the [JMH Visualizer](https://jmh.morethan.io/).

The following command shows how to run a set of benchmarks very quickly, e.g. during development. The result is a very rough and imprecise overview of the expected execution time for the benchmarks:

```shell
java -jar ./benchmarks/target/benchmarks.jar '(quick)|(collections)' -f 1 -i 1 -wf 0 -bm ss -rff benchmarks.json -rf json
```

The parameters used are:

- `<regex>` selects the benchmarks
- `-f 1` run a single fork per measurement
- `-i 1` use a single iteration for the fork
- `-wf 0` no warmup forks
- `-bm ss` Measure "Single shot invocation time"
- `-rff benchmarks.json` write results to `./benchmarks.json`
- `-rf json` write result in JSON format

In JetBrains IntelliJ you can use these parameters as a run configuration while developing benchmarks.

For more information consult the command line help:

```shell
java -jar ./benchmarks/target/benchmarks.jar -h
```

## Links

A. Y. Bhargava, _Grokking Algorithms_, Second edition. Shelter Island, NY: Manning Publications Co, 2024. [Online]. Available: https://livebook.manning.com/book/grokking-algorithms-second-edition/

A. Shipilëv and GitHub Contributors, “GitHub: openjdk/jmh.” Accessed: Mar. 02, 2025. [Online]. Available: https://github.com/openjdk/jmh

J. Jenkov, “JMH - Java Microbenchmark Harness.” Accessed: Mar. 02, 2025. [Online]. Available: http://jenkov.com/tutorials/java-performance/jmh.html

E. Baeldung, “Microbenchmarking with Java.” Accessed: Mar. 01, 2025. [Online]. Available: https://www.baeldung.com/java-microbenchmark-harness

A. Obregon, “Introduction to Java Microbenchmarking with JMH (Java Microbenchmark Harness),” Medium. Accessed: Mar. 02, 2025. [Online]. Available: https://medium.com/@AlexanderObregon/introduction-to-java-microbenchmarking-with-jmh-java-microbenchmark-harness-55af74b2fd38
