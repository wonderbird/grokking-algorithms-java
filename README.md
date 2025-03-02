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

The module [benchmarks](./benchmarks) uses the [Java Microbenchmark Harness JMH](https://github.com/openjdk/jmh) to compare the performance of different search algorithm implementations. To run the benchmarks, enter

```shell
java -jar ./benchmarks/target/benchmarks.jar -rff benchmarks.json -rf json
```

Then you can visualize the results by uploading the ./benchmarks.json file to the [JMH Visualizer](https://jmh.morethan.io/).

## Links

A. Y. Bhargava, _Grokking Algorithms_, Second edition. Shelter Island, NY: Manning Publications Co, 2024. [Online]. Available: https://livebook.manning.com/book/grokking-algorithms-second-edition/

J. Jenkov, “JMH - Java Microbenchmark Harness.” Accessed: Mar. 02, 2025. [Online]. Available: http://jenkov.com/tutorials/java-performance/jmh.html

E. Baeldung, “Microbenchmarking with Java.” Accessed: Mar. 01, 2025. [Online]. Available: https://www.baeldung.com/java-microbenchmark-harness

A. Obregon, “Introduction to Java Microbenchmarking with JMH (Java Microbenchmark Harness),” Medium. Accessed: Mar. 02, 2025. [Online]. Available: https://medium.com/@AlexanderObregon/introduction-to-java-microbenchmarking-with-jmh-java-microbenchmark-harness-55af74b2fd38
